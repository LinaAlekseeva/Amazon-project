package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.WebDriverConfig;
import pages.AuthorizationPage;
import pages.RegistrationPage;
import pages.SearchPage;

public abstract class TestBase {
    public RegistrationPage registrationPage = new RegistrationPage();
    public AuthorizationPage authorizationPage = new AuthorizationPage();
    public SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void beforeAll() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.baseUrl = config.getBaseUrl();
        Selenide.clearBrowserCookies();
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = System.getProperty("remote", "https://localhost:4444/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        if (config.getRemoteWebDriver()) {
            Configuration.remote = config.getRemoteUrl();
        }
    }

    @BeforeEach
    void addListenerAndOpenPage() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}

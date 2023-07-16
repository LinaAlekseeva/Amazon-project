package tests;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverConfig;
import helpers.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AuthorizationPage;
import pages.LanguagePage;
import pages.SearchPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public SearchPage searchPage = new SearchPage();
    public LanguagePage languagePage = new LanguagePage();
    AuthorizationPage authorizationPage = new AuthorizationPage();
    String deutsch = " Deutsch - ";
    String english =" English ";
    String email="testemailforjob153@gmail.com";
    String password = "cZ96X3!!!";
    @BeforeAll
    static void beforeAll() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.timeout = 10000;

        if (config.getRemoteURL() != null) {
            Configuration.remote = config.getRemoteURL();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }

    @BeforeEach
    void addBefore() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Selenide.clearBrowserCookies();
    }

    @AfterEach
    void addAfter() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }

}
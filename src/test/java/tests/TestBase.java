package tests;
import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AuthorizationPage;
import pages.LanguagePage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    public SearchPage searchPage = new SearchPage();
    public LanguagePage languagePage = new LanguagePage();
    AuthorizationPage authorizationPage = new AuthorizationPage();
    String email="testemailforjob153@gmail.com";
    String password = "cZ96X3!!!";
    private static final WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        @BeforeAll
        public static void setUp() {
            Configuration.baseUrl = webDriverConfig.baseUrl();
            Configuration.browser = webDriverConfig.browser();
            Configuration.browserSize = webDriverConfig.browserSize();
            Configuration.browserVersion = webDriverConfig.browserVersion();
            Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }

        @BeforeEach
        public void addLogger() {
            open("https://www.amazon.com");
            SelenideLogger.addListener("allure", new AllureSelenide());
            Selenide.clearBrowserCookies();
        }

        @AfterEach
        void addAttachments() {
            Attach.makeScreenshot("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
            closeWebDriver();
        }
    }
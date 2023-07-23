package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
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

    @BeforeAll
    static void setUp() {
        WebDriverProvider.configure();
    }

    @BeforeEach
    void addListener() {
        open("https://www.amazon.com");
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.addVideo();
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Selenide.closeWebDriver();
    }
}

package tests;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AuthorizationPage;
import pages.LanguagePage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    public SearchPage searchPage = new SearchPage();
    public LanguagePage languagePage = new LanguagePage();
    AuthorizationPage authorizationPage = new AuthorizationPage();
    String email="testemailforjob153@gmail.com";
    String password = "cZ96X3!!!";

    @BeforeAll
    static void beforeAll() {
        open("https://www.amazon.com");
        Configuration.baseUrl = System.getProperty("baseUrl" ,"https://www.amazon.com");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
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
        Selenide.closeWindow();
    }
}
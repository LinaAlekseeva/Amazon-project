package tests;
import config.Auth;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junitpioneer.jupiter.RetryingTest;
import pages.MainPage;
@Epic("Login")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@Story("Successful authorization")
@DisplayName("Authorization check with correct credentials")
public class AuthorizationTests extends TestBase {
    authorizationPage.openPage()
    .inputEmail();

    }
}
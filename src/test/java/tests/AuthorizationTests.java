package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
@Tag("Authorization")
@Epic("Authorization")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@Story("Successful authorization")
@DisplayName("Authorization check with correct credentials")
public class AuthorizationTests extends TestBase {
    @Test
    void AuthorizationForm() {
    step("Заполнить поля формы", () -> {
        authorizationPage.openPage()
                .inputEmail()
                .inputPasswd();

    });
        step(" Проверить результат", () -> {
            authorizationPage.results();
        });
        }
}
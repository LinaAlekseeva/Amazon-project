package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {
    Faker faker = new Faker();

    @Test
    @Tag("faker")
    void RegistrationForm() {
        String name = faker.name().firstName(),
                email = faker.internet().emailAddress(),
                password = faker.internet().password();


        step("Заполнить поля формы и нажать кнопку", () -> {
            registrationPage.openPage()
                    .setName(name)
                    .setEmail(email)
                    .setPassword(password)
                    .setPasswordCheck(password)
                    .pressSubmit();
        });
        step("Проверить корректность заполнения данных в таблице", () -> {
            registrationPage.verifyResults("Your name", name)
                    .verifyResults("Mobile number or email", email)
                    .verifyResults("Password",password)
                    .verifyResults("Re-enter password",password);

        });
        step(" Проверить результат", () -> {
            registrationPage.resultsModal();
        });
    }
}

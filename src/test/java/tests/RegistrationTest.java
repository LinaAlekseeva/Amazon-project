package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
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
            registrationPage.verifyResultsModalAppears()
                    .verifyResults("Student Name", name + " " + lastName)
                    .verifyResults("Student Email", email);

            $(".a-row a-spacing-small")
            "Verify email address"
        });
    }}

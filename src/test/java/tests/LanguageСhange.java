package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class LanguageСhange extends TestBase {
    @Test
    @Tag("language")
    void changeSettings() {
        step("Change language in settings", () -> {
            languagePage.menu()
                    .language();
        });
    }
}

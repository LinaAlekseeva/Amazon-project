package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("Search and adding to basket ")
@Feature("Search a item by typing")
public class SearchTest extends TestBase{
    @Owner("Lina Alekseeva")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Search for google pixel 7 pro")
    @Test

    void SearchTestForm() {
        String name ="google pixel 7 pro";
        step("Заполнить поля формы и нажать кнопку", () -> {
            searchPage.openPage()
                    .setName(name);

        });
        step("Проверить корректность заполнения данных в таблице", () -> {

        });
        step(" Проверить результат", () -> {

        });
    }
}
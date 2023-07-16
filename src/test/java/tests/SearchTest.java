package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("search")
@Epic("Search and adding to basket ")
@Feature("Search a item by typing")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Search")
public class SearchTest extends TestBase {

    @ParameterizedTest
    @CsvSource({
            "Health & Household, Vitamin B12",
            "Books, Fyodor Dostoyevsky: The Complete Novels",
            "Home & Kitchen, Pillow",
            "Kindle Store,The Summer I Turned Pretty"})
    void searchTestForm(
            String itemType,
            String itemName) {
        open("");
        step("Заполнить поля формы и нажать кнопку", () -> {
            searchPage
                    .dropdownBox(itemType)
                    .setName(itemName);
        });
        step("Проверка запроса", () -> {
            searchPage.verifyResults(itemName);

        });
        step("Выбор найденного товара и добавление его в List", () -> {
            searchPage.choice()
                      .addToList();
            authorizationPage.authorization(email,password);
        });
        step("Проверка запроса", () -> {
            searchPage.verifyResultsAll();
        });
}}

package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.step;
@Tag("SearchAndBasket ")
@Epic("Search and adding to basket ")
@Feature("Search a item by typing")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Search")
public class SearchTest extends TestBase{
    @BeforeEach
    public void beforeEach() {
        searchPage.openPage();
    }
    @Test
    @CsvSource(value = {
            "Health & Household | Vitamin B12",
            "Books | Fyodor Dostoyevsky: The Complete Novels",
            "Home & Kitchen | Blender",
            "Baby | Pacifier ",
    }, delimiter = '|')
    @ParameterizedTest(name = "{arguments}")
    void SearchTestForm(String itemType, String itemName) {
        Allure.getLifecycle().updateTestCase(test ->
                        test.setName("An existing item can be found with filter: [Filter, Search text]"));
        step("Заполнить поля формы и нажать кнопку", () -> {
            searchPage.dropdownBox(itemType)
                    .setName(itemName);
        });
        step(" Проверить результат и добавить в корзину", () -> {
            searchPage.verifyResults(itemName)
                    .addBasket()
                    .checkBasket(itemName);
        });
    }
}
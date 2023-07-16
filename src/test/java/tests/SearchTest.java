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
    @BeforeEach
    public void beforeEach() {
        open("");
    }

    @ParameterizedTest
    @CsvSource({
            "Health & Household, Vitamin B12",
            "Books, Fyodor Dostoyevsky: The Complete Novels",
            "Home & Kitchen, Blender",
            "Baby, Pacifier "})
    void searchTestForm(
            String itemType,
            String itemName) {
        step("Заполнить поля формы и нажать кнопку", () -> {
            searchPage
                    .dropdownBox(itemType)
                    .setName(itemName);
        });
    }
}
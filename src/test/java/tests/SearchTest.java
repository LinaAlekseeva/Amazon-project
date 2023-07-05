package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
@Tag("Search")
@Epic("Search and adding to basket ")
@Feature("Search a item by typing")
@Owner("Lina Alekseeva")
@Severity(SeverityLevel.CRITICAL)
@DisplayName("Search")
public class SearchTest extends TestBase{
    @BeforeEach
    public void beforeEach() {
        open("https://www.amazon.com");
    }
    @ParameterizedTest
    @CsvSource({
            "Health&Household, Vitamin B12",
            "Books, Fyodor Dostoyevsky: The Complete Novels",
            "Home&Kitchen, Blender",
            "Baby, Pacifier "})

     @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})
      void searchTestForm (
              String itemType,
              String itemName) {
        Allure.getLifecycle().updateTestCase(test ->
                        test.setName("An existing item can be found with filter: [Filter, Search text]"));
        step("Заполнить поля формы и нажать кнопку", () -> {
            searchPage.dropdownBox(itemType)
                    .setName(itemName);
        });
    }
}
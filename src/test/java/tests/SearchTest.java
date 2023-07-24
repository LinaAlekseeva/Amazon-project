package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
            "Home & Kitchen, Bed sheets full size cooling",
            "Kindle Store,The Summer I Turned Pretty"})
    void searchTestForm(
            String itemType,
            String itemName) {

        step("Fill in the form fields and click the button", () -> {
            searchPage
                    .dropdownBox(itemType)
                    .setName(itemName);
        });
        step("Request Validation", () -> {
            searchPage.verifyResults(itemName);

        });
        step("Selecting the found product and adding it to the List", () -> {
            searchPage.choice()
                    .addToList();

        });

    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class SearchPage {
    private SelenideElement textBox = $("#twotabsearchtextbox");
    private SelenideElement dropdownBox = $("#searchDropdownBox");
    private SelenideElement box = $ ("#nav-search-bar-form");
    private SelenideElement searchButton = $("#nav-search-submit-button");
    private SelenideElement choiceProduct = $(".s-image");
    private SelenideElement results = $(".a-size-medium-plus.a-color-base.a-text-bold");
    private SelenideElement verifyResultsSearchName = $(".a-color-state.a-text-bold");
    private SelenideElement addToList = $(".a-button-text.a-text-left");
    private SelenideElement verifyResultsAll = $(".a-section.a-spacing-base");
    public SearchPage dropdownBox(String itemType) {
        dropdownBox.click();
        box.$(byText(itemType)).click();

        return this;
    }

    public SearchPage setName(String itemName) {
        textBox.click();
        textBox.setValue(itemName).click();
        searchButton.click();
        return this;
    }
    public SearchPage choice (){
        choiceProduct.click();
        return this;
    }

    public SearchPage verifyResults (String itemName) {
        results.should(appear);
        verifyResultsSearchName.shouldHave(text(itemName));
        return this;
    }
    public SearchPage addToList () {
        addToList.click();
        return this;
    }
    public SearchPage verifyResultsAll () {
        verifyResultsAll.shouldHave(text("Enter the characters you see"));
        return this;
    }
}
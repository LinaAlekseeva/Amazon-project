package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    private SelenideElement textBox = $("#twotabsearchtextbox");
    private SelenideElement dropdownBox = $("#searchDropdownBox");
    private SelenideElement box = $ ("#nav-search-bar-form");
    private SelenideElement searchButton = $("#nav-search-submit-button");
    private SelenideElement resultsList = $(".sg-col-inner");
    private SelenideElement verifyTitle = $("#title_feature_div");

    public SearchPage dropdownBox(String itemType) {
        dropdownBox.click();
        box.shouldHave(text(itemType)).click();
        return this;
    }

    public SearchPage setName(String itemName) {
        textBox.click();
        textBox.setValue(itemName).click();
        searchButton.click();
        return this;
    }


    public SearchPage OpenMenu(String name) {
        resultsList.$(byText(name)).click();
        verifyTitle.shouldHave(text(name));
        return this;
    }

}
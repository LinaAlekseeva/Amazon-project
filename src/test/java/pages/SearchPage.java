package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    private SelenideElement textBox =$("#twotabsearchtextbox");
    private SelenideElement dropdownBox=$("#searchDropdownBox");
    private SelenideElement searchButton= $("#nav-search-submit-button");
    private SelenideElement resultsList = $(".sg-col-inner");
    private SelenideElement verifyTitle = $("#title_feature_div");
    public void openPage() {
        open("https://www.amazon.com/");

    }
    public SearchPage dropdownBox (String name) {
        dropdownBox.click();
        dropdownBox.setValue(name);
        return this;
    }

        public SearchPage setName (String name) {
        textBox.click();
        textBox.setValue(name);
        searchButton.click();
        return this;
    }



    public SearchPage verifyResults (String name) {
        resultsList.$(byText(name)).click();
        verifyTitle.shouldHave(text(name));
        return this;
    }



}
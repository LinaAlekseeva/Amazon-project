package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    private SelenideElement allBox =$("#twotabsearchtextbox");
    private SelenideElement searchButton= $("#nav-search-submit-button");
    private SelenideElement results = $(".sg-col-inner");
    public RegistrationPage openPage() {
        open("https://www.amazon.com/");

    }
    public SearchPage setName (String name) {
        allBox.click();
        allBox.setValue(name);
        searchButton.click();
        return this;
    }
    public SearchPage results (String name) {
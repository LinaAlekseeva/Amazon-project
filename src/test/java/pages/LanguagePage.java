package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    private SelenideElement openMenu = $("#nav-hamburger-menu");
    private SelenideElement languageChange = $("#hmenu-icp-language");
    private SelenideElement language = $(".a-label.a-radio-label");
    public LanguagePage menu () {
        openMenu.click();
        languageChange.click();
        return this;
    }

    public LanguagePage language (String name) {
        language.shouldHave(text(name)).click();
        return this;
    }

}

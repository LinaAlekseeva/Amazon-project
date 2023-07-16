package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LanguagePage {
    private SelenideElement openMenu = $("#nav-hamburger-menu");
    private SelenideElement languageChange = $("#hmenu-icp-language");
    private SelenideElement language = $("a-radio.a-radio-fancy");
    public LanguagePage menu () {
        openMenu.click();
        return this;
    }

    public LanguagePage language (String name) {
        languageChange.click();
        language.shouldHave(text(name));
        return this;
    }

}

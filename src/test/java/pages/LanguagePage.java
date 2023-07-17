package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    private SelenideElement openMenu = $("#icp-nav-flyout");
    private SelenideElement language = $(".a-row.a-spacing-mini");
    public LanguagePage menu () {
        openMenu.click();
        return this;
    }

    public LanguagePage language (String deutsch) {
        language.shouldHave(Condition.attribute(deutsch)).click();
        return this;
    }

}

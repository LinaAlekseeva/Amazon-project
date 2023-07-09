package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LanguagePage {
    private SelenideElement openMenu = $("#HamburgerMenuDesktop");
    private SelenideElement languageChange = $("#hmenu-icp-language");
    public void openPage() {
        open("https://www.amazon.com");

    }
    public LanguagePage menu () {
        openMenu.click();
        return this;
    }

    public LanguagePage language () {
        languageChange.click();
        return this;
    }

}

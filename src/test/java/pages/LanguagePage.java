package pages;


import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    private SelenideElement openMenu = $("#icp-nav-flyout");
    private SelenideElement language = $("#icp-language-translation-hint");
    private SelenideElement currency = $(".a-button-inner");
    private SelenideElement eur = $("#icp-currency-dropdown_19");
    private SelenideElement saveChanges = $("#icp-save-button");
    private SelenideElement checkHeader = $("#gw-sign-in-button");

    public LanguagePage menu() {
        openMenu.click();
        return this;
    }

    public LanguagePage language() {
        language.click();
        currency.click();
        eur.click();
        saveChanges.doubleClick();
        return this;
    }

    public LanguagePage verifyResultsChangeLanguage() {
        checkHeader.equals("Iniciar sesión de forma segura");
        return this;
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {
    private SelenideElement open = $("#nav-link-accountList");
    private SelenideElement apEmail = $("#ap_email");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        open.click();
        return this;
    }
    public void inputEmail (String login) {
        apEmail.sendKeys(login); }
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
}

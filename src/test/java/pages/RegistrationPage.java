package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private SelenideElement createAccount = $("#createAccountSubmit ");
    private SelenideElement open = $("#nav-link-accountList");
    private SelenideElement setName = $("#ap_customer_name");
    private SelenideElement setEmail = $("#ap_email");
    private SelenideElement setPassword = $("#ap_password");
    private SelenideElement setPasswordCheck = $("#ap_password_check");
    private SelenideElement pressSubmit = $("#continue");
    private SelenideElement results = $(".a-row a-spacing-small");

    public RegistrationPage openPage() {
        open("/");
        open.click();
        createAccount.click();
        return this;
    }

    public RegistrationPage setName(String name) {
        setName.click();
        setName.setValue(name);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        setEmail.click();
        setEmail.setValue(email);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        setPassword.click();
        setPassword.setValue(password);
        return this;
    }

    public RegistrationPage setPasswordCheck(String password) {
        setPasswordCheck.click();
        setPassword.setValue(password);
        return this;
    }

    public RegistrationPage pressSubmit() {
        pressSubmit.click();
        return this;
    }

    public RegistrationPage resultsModal() {
        results.should(appear);
        results.shouldHave(text("Verify email address"));
        return this;
    }

    public RegistrationPage verifyResults(String key, String value) {
        $(".a-box a-spacing-extra-large").$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }

}
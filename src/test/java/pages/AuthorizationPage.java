package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    private SelenideElement signInEmail = $("#ap_email");
    private SelenideElement buttonContinue = $("#continue");
    private SelenideElement signInPassword = $("#ap_password");
    private SelenideElement buttonSignIn = $("#signInSubmit");

    public AuthorizationPage authorization(String email, String password) {
        signInEmail.setValue(email);
        buttonContinue.click();
        signInPassword.setValue(password);
        buttonSignIn.click();
        return this;
    }
}

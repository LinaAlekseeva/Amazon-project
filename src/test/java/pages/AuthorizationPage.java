package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {

    private SelenideElement open = $("#nav-link-accountList");
    private SelenideElement apEmail = $("#ap_email");
    private SelenideElement continuePasswd= $("#continue-announce");
    private SelenideElement passwdField = $("#ap_password");
    private SelenideElement signIn = $("#signInSubmit");
    private SelenideElement skipLink = $("#ap-account-fixup-phone-skip-link");
    private SelenideElement check = $(".a-box-inner");
    public AuthorizationPage openPage() {
        open("/");
        open.click();
        return this;
    }

    public AuthorizationPage inputEmail () {
        apEmail.sendKeys("testemailforjob153@gmail.com");
        continuePasswd.click();
        return this;
    }
    public AuthorizationPage inputPasswd () {
        passwdField.sendKeys("123456");
        signIn.click();
        skipLink.click();
        return this;
    }
    public AuthorizationPage results () {
        open.click();
        check.shouldHave(Condition.attribute("Your Profiles"));
        return this;
    }
}


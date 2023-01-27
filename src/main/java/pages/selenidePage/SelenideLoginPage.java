package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import pages.SecurePage;

import static com.codeborne.selenide.Selenide.$;

public class SelenideLoginPage {
    private SelenideElement usernameInput = $("#username");
    private SelenideElement passwordInput = $("#username");
    private SelenideElement loginButton = $("button[type='submit']");

    public SelenideLoginPage setUsername(String name){
        usernameInput.shouldBe(Condition.visible).sendKeys(name);
        return this;
    }

    public SelenideLoginPage setPassword(String password){
        passwordInput.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public SelenideSecurePage clickLoginButton() {
        loginButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        return new SelenideSecurePage();
    }
}

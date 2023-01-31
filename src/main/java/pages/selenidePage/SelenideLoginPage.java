package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenideLoginPage {
    private final SelenideElement usernameInput = $("#username");
    private final SelenideElement passwordInput = $("#username");
    private final SelenideElement loginButton = $("button[type='submit']");

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

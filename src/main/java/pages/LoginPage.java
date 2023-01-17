package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".radius")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage setUsername(String username) {
        setText(usernameInput, username);
        return this;
    }

    public LoginPage setPassword(String password) {
        setText(passwordInput, password);
        return this;
    }

    public SecurePage clickLoginButton() {
        clickButton(loginButton);
        return new SecurePage(driver);
    }

    public SecurePage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public SecurePage loginWithInvalidCreds(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
        return new SecurePage(driver);
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage extends BasePage {
    @FindBy(css = "a.radius")
    private WebElement logoutButton;

    @FindBy(tagName = "h2")
    private WebElement pageName;

    @FindBy(id = "flash-messages")
    private WebElement resultMessage;

    public SecurePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage logout() {
        logoutButton.click();
        return new LoginPage(driver);
    }

    public String getPageName() {
        return pageName.getText();
    }

    public boolean checkPopUp(){
        boolean result = false;
        String[] answer = {
                "You logged into a secure area!",
                "Your username is invalid!",
                "Your password is invalid!"
        };
        System.out.println(resultMessage.getText());
        for (String s : answer) {
            if (resultMessage.getText().contains(s)) {
                System.out.println(s);
                result = true;
                break;
            }
        }
        return result;
    }
}

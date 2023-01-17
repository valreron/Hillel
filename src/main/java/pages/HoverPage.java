package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class HoverPage extends BasePage {
    @FindBy(xpath = "//div[@class='figure']")
    private List<WebElement> user;

    @FindBy(xpath = "//div[@class='figcaption']/h5")
    private List<WebElement> userName;

    public HoverPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    Actions actions = new Actions(driver);

    public HoverPage checkUserName() {
        for (int i = 0; i < 3; i++) {
            actions.moveToElement(user.get(i)).perform();
            boolean isDisplayed = userName.get(i).isDisplayed();
            if(isDisplayed) {
                System.out.println(userName.get(i).getText());
            }else {
                throw new NoSuchElementException();
            }
        }
        return this;
    }
}

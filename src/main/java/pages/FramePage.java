package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage {
    @FindBy(xpath = "//a[contains(@href,\"iframe\")]")
    private WebElement iframe;

    @FindBy(tagName = "iframe")
    private WebElement frame;

    @FindBy(tagName = "body")
    private WebElement inputLine;

    public FramePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FramePage goToIframe() {
        iframe.click();
        return this;
    }

    public FramePage switchToFrame() {
        driver.switchTo().frame(frame);
        return this;
    }

    public FramePage clearLine() {
        inputLine.clear();
        return this;
    }

    public FramePage inputInFrame() {
        inputLine.sendKeys("test");
        return this;
    }

}

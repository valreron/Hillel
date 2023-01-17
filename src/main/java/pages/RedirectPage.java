package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RedirectPage extends BasePage{
    @FindBy(id = "redirect")
    private WebElement hereButton;

    @FindBy(css = ".example li")
    private List<WebElement> statusCodeElement;

    public RedirectPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public RedirectPage openStatusCodes(){
        hereButton.click();
        return this;
    }

    public RedirectPage showCodes(){
        statusCodeElement.forEach(w -> System.out.println(w.getText()));
        return this;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DomPage extends BasePage{
    @FindBy(css = ".large-2.columns")
    private List<WebElement> domButton;

    @FindBy(xpath = "//*[@class='large-10 columns']/table/tbody/tr/td[4]")
    private List<WebElement> table4Element;

    public DomPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public DomPage clickButtons(){
        domButton.forEach(w -> {
            System.out.println(w.getText());
            w.click();
        });
        return this;
    }

    public DomPage findTableElements(){
        System.out.println("Table elements: ");
        table4Element.forEach(element -> System.out.println(element.getText()));
        return this;
    }

}

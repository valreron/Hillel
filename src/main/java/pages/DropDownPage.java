package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends BasePage {
    @FindBy(tagName = "select")

    private WebElement element;
    public DropDownPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }



    public DropDownPage selectValue(){
        Select select = new Select(element);
        List<String> value = select.getAllSelectedOptions().stream().map(WebElement::getText).toList();
        System.out.println(value);
        select.selectByValue("2");

        return this;
    }

}

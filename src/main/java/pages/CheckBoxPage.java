package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BasePage {
    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> checkBoxElement;


    public CheckBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public CheckBoxPage checkCheckBox() {
        System.out.println("check boxes:");
        checkBoxElement.forEach(w -> {
            if (!w.isSelected()) {
                System.out.println("Unchecked");
                w.click();
            } else {
                System.out.println("Checked");
            }
        });
        return this;
    }

}

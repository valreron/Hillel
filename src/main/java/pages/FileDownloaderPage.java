package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloaderPage extends BasePage {

    @FindBy(linkText = "LambdaTest.txt")
    private WebElement myfileTxt;


    public FileDownloaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FileDownloaderPage downloadingFile() {
        myfileTxt.click();
        return this;
    }

}


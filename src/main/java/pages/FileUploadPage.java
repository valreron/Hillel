package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends BasePage {

    @FindBy(css = "input[id*='file-upload']")
    private WebElement chooseFile;

    @FindBy(css = "input[class*='button']")
    private WebElement uploadButton;

    @FindBy(css = "div[class*='panel text-center']")
    private WebElement fileUploaded;

    public FileUploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FileUploadPage uploadingFile(String filePath) {
        chooseFile.sendKeys(filePath);
        uploadButton.click();
        return this;
    }
    public String checkingResult(){
        System.out.println(fileUploaded.getText());
        return fileUploaded.getText();
    }

}

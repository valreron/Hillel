package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthLink;

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDom;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkBox;

    @FindBy(linkText = "Redirect Link")
    private WebElement redirect;

    @FindBy(linkText = "Hovers")
    private WebElement hover;

    @FindBy(linkText = "Frames")
    private WebElement frame;

    @FindBy(linkText = "Dropdown")
    private  WebElement dropdown;

    @FindBy(linkText = "File Download")
    private WebElement fileDownload;

    @FindBy(linkText = "File Upload")
    private WebElement fileUpload;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage goToLoginPage() {
        clickButton(formAuthLink);
        return new LoginPage(driver);
    }

    public DomPage goToDomPage() {
        clickButton(challengingDom);
        return new DomPage(driver);
    }

    public CheckBoxPage goToCheckBoxPage(){
        clickButton(checkBox);
        return new CheckBoxPage(driver);
    }

    public RedirectPage goToRedirectPage(){
        clickButton(redirect);
        return new RedirectPage(driver);
    }

    public HoverPage goToHoverPage(){
        clickButton(hover);
        return new HoverPage(driver);
    }

    public  FramePage goToFramePage(){
        clickButton(frame);
        return new FramePage(driver);
    }

    public DropDownPage goToDropDownPage(){
        clickButton(dropdown);
        return new DropDownPage(driver);
    }

    public FileDownloaderPage goToDownloadPage(){
        clickButton(fileDownload);
        return new FileDownloaderPage(driver);
    }

    public FileUploadPage goToUploadPage(){
        clickButton(fileUpload);
        return new FileUploadPage(driver);
    }
}

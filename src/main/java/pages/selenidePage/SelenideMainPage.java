package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMainPage {
    private final SelenideElement formLink = $(By.linkText("Form Authentication"));

    private final SelenideElement fileDownload = $(By.linkText("File Download"));
    private final SelenideElement fileUpload = $(By.linkText("File Upload"));



    public SelenideLoginPage goToLoginPage() {
        formLink.shouldBe(Condition.visible).click();
        return new SelenideLoginPage();
    }
    public SelenideFileDownloaderPage goToDownloadPage() {
        fileDownload.shouldBe(Condition.visible).click();
        return new SelenideFileDownloaderPage();
    }
    public SelenideFileUploaderPage goToUploadPage() {
        fileUpload.shouldBe(Condition.visible).click();
        return new SelenideFileUploaderPage();
    }
}

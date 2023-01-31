package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class SelenideFileDownloaderPage {
    private final SelenideElement myFileTxt = $(By.linkText("LambdaTest.txt"));

    public File downloadingFile() throws FileNotFoundException {
        return myFileTxt.shouldBe(Condition.visible).download();
    }
}

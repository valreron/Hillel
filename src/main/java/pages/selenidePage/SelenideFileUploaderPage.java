package pages.selenidePage;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class SelenideFileUploaderPage {

    private final SelenideElement chooseFile = $("input[id*='file-upload']");
    private final SelenideElement uploadButton = $("input[class*='button']");
    private final SelenideElement fileUploaded = $("div[class*='panel text-center']");


    public SelenideFileUploaderPage uploadingFile(File file) {
        //chooseFile.sendKeys(new File(filePath).getAbsolutePath());
        chooseFile.uploadFile(file);
       // chooseFile.uploadFromClasspath(fileName);

        uploadButton.click();
        return this;
    }

    public String checkingResult() {
        System.out.println(fileUploaded.getText());
        return fileUploaded.getText();
    }
}

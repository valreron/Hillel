package lessons.lessonSelenide.Homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.selenidePage.SelenideFileDownloaderPage;
import pages.selenidePage.SelenideFileUploaderPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class SelenideFileTest extends SelenideBaseTest {

    @Test
    public void downloadingTest() throws IOException {
        SelenideFileDownloaderPage fileDownloaderPage = openMainPage().goToDownloadPage();
        setFile(new File(fileDownloaderPage.downloadingFile().getAbsolutePath()));
        System.out.println(getFile().getAbsolutePath());
        Assert.assertEquals(getFile().getName(), fileName);
        List<String> lines = Files.readAllLines(getFile().toPath());
        System.out.println(lines);

        lines = new ArrayList<>();
        lines.add("test line 1\s");
        lines.add("test line 2\s");
        lines.add("test line 3\s");
        Files.write(getFile().toPath(), lines, StandardOpenOption.APPEND);
        System.out.println(lines);
    }

    @Test
    public void uploadingTest() {
        SelenideFileUploaderPage uploaderPage = openMainPage().goToUploadPage();
        uploaderPage.uploadingFile(getFile());
        Assert.assertEquals(uploaderPage.checkingResult(), fileName);
    }
}

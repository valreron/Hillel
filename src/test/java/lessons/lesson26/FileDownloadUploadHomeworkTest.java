package lessons.lesson26;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileDownloaderPage;
import pages.FileUploadPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileDownloadUploadHomeworkTest extends BaseTest {
    @Test
    public void downloadTest() throws IOException {
        FileDownloaderPage fileDownload = openMainPage()
                .goToDownloadPage();
        fileDownload.downloadingFile();

        boolean fileIsThere = false;
        File dir;
        while (!fileIsThere) {
            dir = new File(filePath).getAbsoluteFile();
            File[] dirContents = dir.listFiles();
            assert dirContents != null;
            for (File dirContent : dirContents) {
                if (dirContent.getName().equals(fileName)) {
                    System.out.println("File if founded");
                    fileIsThere = true;
                    break;
                }
            }
        }

        File file = new File(filePath + fileName);

        List<String> lines = Files.readAllLines(file.toPath());
        System.out.println(lines);

        lines = new ArrayList<>();
        lines.add("test line 1\s");
        lines.add("test line 2\s");
        lines.add("test line 3\s");

        Files.write(file.toPath(), lines, StandardOpenOption.APPEND);
        System.out.println(lines);

    }

    @Test
    public void uploadingTest() {
        FileUploadPage fileUploadPage = openMainPage().goToUploadPage();
        fileUploadPage.uploadingFile(filePath + fileName);
        Assert.assertEquals(fileUploadPage.checkingResult(), fileName);
    }
}

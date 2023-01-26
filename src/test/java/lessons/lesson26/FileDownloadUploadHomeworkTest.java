package lessons.lesson26;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileDownloaderPage;
import pages.FileUploadPage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDownloadUploadHomeworkTest extends BaseTest {
    @Test
    public void downloadTest() throws IOException {
        FileDownloaderPage fileDownload = openMainPage()
                .goToDownloadPage();
        fileDownload.downloadingFile();

        boolean fileIsThere = false;
        while (!fileIsThere) {
            File dir = new File(filePath);
            File[] dirContents = dir.listFiles();
            assert dirContents != null;
            for (File dirContent : dirContents) {
                if (dirContent.getName().equals(fileName)) {
                    System.out.println("Text if founded");
                    fileIsThere = true;
                    break;
                }
            }
        }

        FileWriter FW = new FileWriter(filePath + fileName, true);//add info to file
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
        BW.append("This Is First Line.");
        BW.newLine();
        BW.append("This Is Second Line.");
        BW.close();

    }

    @Test
    public void uploadingTest() {
        FileUploadPage fileUploadPage = openMainPage().goToUploadPage();
        fileUploadPage.uploadingFile(filePath + fileName);
        Assert.assertEquals(fileUploadPage.checkingResult(), fileName);
    }
}

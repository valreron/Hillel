package lessons.lesson26;

import lessons.homeworkOfLesson18.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {

    @Test
    public void downloadTest(){
        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("test2.txt")).click();
        System.out.println("done");

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.cssSelector("#file-upload"))
                .sendKeys(new File(("/target/test2.txt")).getAbsolutePath());
        driver.findElement(By.cssSelector("file-submit")).click();
    }
}

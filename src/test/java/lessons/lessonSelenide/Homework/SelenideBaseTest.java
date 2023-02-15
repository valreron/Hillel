package lessons.lessonSelenide.Homework;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import pages.selenidePage.SelenideMainPage;

import java.io.File;

import static com.codeborne.selenide.Selenide.open;

public class SelenideBaseTest {
    static{
        System.setProperty("extent.reporter.html.start","true");
        System.setProperty("extent.reporter.html.out","target/extentReport/ExtentHTML.html");
    }
    protected static String fileName = "LambdaTest.txt";
    protected static String filePath = "target/downloads/";

    @BeforeClass
    public void setUp() {
        Configuration.downloadsFolder = filePath;
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
    }

    public SelenideMainPage openMainPage() {
        open("https://the-internet.herokuapp.com/");
        return new SelenideMainPage();
    }

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}

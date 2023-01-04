package lessons.homeworkOfLesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    Utils utils = new Utils();
    WebDriver driver = new ChromeDriver();

    @BeforeTest(alwaysRun = true)
    public void startTest() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterTest(alwaysRun = true)
    public void endTest(){
        driver.quit();
    }
}

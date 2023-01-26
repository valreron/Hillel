package lessons.homeworkOfLesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;
    protected static String filePath = "/Users/valerijmokrinskij/Documents/";
    protected static String fileName = "LambdaTest.txt";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", filePath);
        options.setExperimentalOption("prefs", prefs);

        this.driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public MainPage openMainPage() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}

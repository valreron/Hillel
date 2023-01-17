package lessons.homeworkOfLesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

public class BaseTest {
    protected WebDriver driver;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    public MainPage openMainPage(){
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}

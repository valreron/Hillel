package lessons.homeworkOfLesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver = new ChromeDriver();

    public void openSuite(WebDriver driver, String url) {
        driver.get(url);
        System.out.println(driver.getTitle());//get suite Title
    }

    public void loginIn(WebDriver driver, String inputName, String inputPass) {  //true pass, zero login
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        String[] answer = {
                "You logged into a secure area!",
                "Your username is invalid!",
                "Your password is invalid!"
        };
        boolean result = false;

        //input login
        userName.click();
        userName.sendKeys(inputName);
        //input pass
        userPass.click();
        userPass.sendKeys(inputPass);
        driver.findElement(By.cssSelector(".radius")).click();
        WebElement message = driver.findElement(By.id("flash-messages"));
        System.out.println(message.getText());
        for (String s : answer) {
            if (message.getText().contains(s)) {
                System.out.println(s);
                result = true;
                break;
            }
        }
        Assert.assertTrue(result);
    }

    @BeforeTest(alwaysRun = true)
    public void startTest() {
        WebDriverManager.chromedriver().setup();

    }

    @AfterTest(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }

}

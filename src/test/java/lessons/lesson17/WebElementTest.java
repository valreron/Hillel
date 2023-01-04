package lessons.lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebElementTest {
    @Test
    public void webElementTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Redirect Link")).click();
        driver.findElement(By.id("redirect")).click();
        List<WebElement> elementTestList = driver.findElements(By.cssSelector(".example li"));
        elementTestList.forEach(w -> System.out.println(w.getText()));
       // driver.quit();
    }
}

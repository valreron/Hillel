package lessons.lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest {
    @Test
    public void frameTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);

        driver.findElement(By.tagName("body")).clear();
        driver.findElement(By.tagName("body")).sendKeys("test");

        List<WebElement> elements = driver.findElements(By.id("page-footer"));
        System.out.println(elements.size());
    }
}

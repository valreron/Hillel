package lessons.lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectTest {
    @Test
    public void selectTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement elementE1 = driver.findElement(By.tagName("select"));

        Select select = new Select(elementE1);

        List<String> value = select.getAllSelectedOptions().stream().map(WebElement::getText).toList();

        System.out.println(value);

        select.selectByValue("2");
        driver.quit();
    }
}

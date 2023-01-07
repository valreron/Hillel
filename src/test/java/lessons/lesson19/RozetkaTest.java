package lessons.lesson19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RozetkaTest {
    @Test
    public void rozetkaTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rozetka.com.ua/");//todo

        driver.findElement(By.id("fat-menu")).click();
        WebElement link = driver.findElement(By.xpath("//a[contains(@class,'menu-categories__link js') and text()='Бытовая техника']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(link).pause(1000)
                .moveToElement(driver.findElement(By.xpath("//a[text()=' Тостеры ']")))
                .click()
                .perform();
    }

}

package lessons.homeworkOfLesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ClickTest extends BaseTest {
    @Test
    public void webElementTest() {
        openSuite(driver, "https://the-internet.herokuapp.com/challenging_dom");
        List<WebElement> button = driver.findElements(By.cssSelector(".large-2.columns"));
        button.forEach(w -> {
            System.out.println(w.getText());
            w.click();
        });
        List<WebElement> table4Element = driver.findElements(By.xpath("//*[@class='large-10 columns']/table/tbody/tr/td[4]"));
        System.out.println("Table elements: ");
        table4Element.forEach(element -> System.out.println(element.getText()));

    }

    @Test
    public void TrueLoginInputsTest() {
        openSuite(driver, "https://the-internet.herokuapp.com/login");
        loginIn(driver, "tomsmith", "SuperSecretPassword!");

    }

    @Test
    public void onlyUserFalseNameLoginTest() {       //false login, Empty pass
        openSuite(driver, "https://the-internet.herokuapp.com/login");
        loginIn(driver, "tomsmith1", "");

    }

    @Test
    public void onlyLoginTrueNameLoginTest() {       //true login, Empty pass
        openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        loginIn(driver, "tomsmith", "");

    }

    @Test
    public void allEmptyLoginTest() {       //empty login, empty pass
        openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        loginIn(driver, "", "");

    }

    @Test
    public void checkingCheckBoxTest() {
        openSuite(driver, "https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxElement = driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("check boxes:");

        checkBoxElement.forEach(w -> {
            if (!w.isSelected()) {
                System.out.println("Unchecked");
                w.click();
            } else {
                System.out.println("Checked");
            }
        });
    }

}

package lessons.homeworkOfLesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ClickTest extends BaseTest {
    @Test
    public void webElementTest() {
        utils.openSuite(driver, "https://the-internet.herokuapp.com/challenging_dom");
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
        utils.openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        utils.loginIn(driver, userName, "tomsmith", userPass, "SuperSecretPassword!");

    }

    @Test
    public void onlyUserFalseNameLoginTest() {       //false login, Empty pass
        utils.openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        utils.loginIn(driver, userName, "tomsmith1", userPass, "");

    }

    @Test
    public void onlyLoginTrueNameLoginTest() {       //true login, Empty pass
        utils.openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        utils.loginIn(driver, userName, "tomsmith", userPass, "");

    }

    @Test
    public void allEmptyLoginTest() {       //empty login, empty pass
        utils.openSuite(driver, "https://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        WebElement userPass = driver.findElement(By.id("password"));
        utils.loginIn(driver, userName, "", userPass, "");

    }

    @Test
    public void checkingCheckBoxTest() {
        utils.openSuite(driver, "https://the-internet.herokuapp.com/checkboxes");
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

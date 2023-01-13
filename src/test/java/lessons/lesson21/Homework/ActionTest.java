package lessons.lesson21.Homework;

import lessons.homeworkOfLesson18.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionTest extends BaseTest {
    @Test
    public void dragAndDropTest() {
        openSuite(driver, "https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
        Assert.assertTrue(to.getText().contains("Dropped!"));
        System.out.println("I dropped!");
    }

    @Test
    public void dropDownTest() {
        openSuite(driver, "https://crossbrowsertesting.github.io/hover-menu.html");
        driver.findElement(By.xpath("//*[contains (text(), 'Dropdown ' ) ]")).click();

        WebElement link = driver.findElement(By.xpath("//*[contains (text(), 'Secondary Menu' ) ]"));
        WebElement secondPage = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).pause(1000)
                .moveToElement(driver.findElement(By.xpath("//li/a[text()='Secondary Action']")))
                .click()
                .perform();

        Assert.assertTrue(secondPage.isDisplayed());
        System.out.println(secondPage.getText());
    }

    @Test
    public void checkUserTest() {
        openSuite(driver, "https://the-internet.herokuapp.com/hovers");

        List<WebElement> users = driver.findElements(By.xpath("//div[@class='figure']"));
        List<WebElement> nameUsers;
        Actions actions = new Actions(driver);

        for (int i = 0; i < 3; i++) {
            actions.moveToElement(users.get(i)).perform();
            nameUsers = driver.findElements(By.xpath("//div[@class='figcaption']/h5"));
            Assert.assertTrue(nameUsers.get(i).isDisplayed());
            System.out.println(nameUsers.get(i).getText());

        }
    }
}

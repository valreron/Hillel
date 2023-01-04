package lessons.homeworkOfLesson18;

import lesson10.ButtonNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
    public void openSuite(WebDriver driver, String url) {
        driver.get(url);
        System.out.println(driver.getTitle());//get suite Title
    }

//    public void loginIn(WebDriver driver, WebElement userName,String inputName) {  //notEmpty login, zero pass
//        //check fail password
//        userName.click();
//        userName.sendKeys(inputName);
//        driver.findElement(By.cssSelector(".radius")).click();
//        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your password is invalid!')]"));
//        System.out.println(message.getText());
//    }
//
//    public void loginIn(WebElement userPass, WebDriver driver,String inputPass) {  //true pass, zero login
//        //check fail password
//        userPass.click();
//        userPass.sendKeys(inputPass);
//        driver.findElement(By.cssSelector(".radius")).click();
//        WebElement message = driver.findElement(By.xpath("//div[contains(text(),'Your username is invalid!')]"));
//        System.out.println(message.getText());
//    }


    public void loginIn(WebDriver driver, WebElement userName, String inputName, WebElement userPass, String inputPass) {  //true pass, zero login
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
        if (!result)
            throw new ButtonNotFoundException();
    }

}

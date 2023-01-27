package lessons.lessonSelenide;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.selenidePage.SelenideMainPage;

import static com.codeborne.selenide.Selenide.open;

public class SelenideLoginTest {

    @Test
    public void loginTest() {
        open("https://the-internet.herokuapp.com/");

        String pageText = new SelenideMainPage().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword")
                .clickLoginButton()
                .getPageName();
        Assert.assertTrue(pageText.contains("Secure Area"));
    }
}

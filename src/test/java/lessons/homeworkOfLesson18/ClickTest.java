package lessons.homeworkOfLesson18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.DomPage;
import pages.SecurePage;

public class ClickTest extends BaseTest {
    @Test
    public void domElementTest() {
        DomPage domPage = openMainPage()
                .goToDomPage()
                .clickButtons();
        domPage.findTableElements();
    }

    @Test
    public void TrueLoginInputsTest() {
        SecurePage securePage = openMainPage()
                .goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();

        String text = securePage.getPageName();
        Assert.assertTrue(text.contains("Secure Area"));
        Assert.assertTrue(securePage.checkPopUp());
    }

    @Test
    public void onlyUserFalseNameLoginTest() {
        SecurePage securePage = openMainPage()
                .goToLoginPage()
                .loginWithInvalidCreds("tomsmith1", "");

        String text = securePage.getPageName();
        Assert.assertFalse(text.contains("Secure Area"));
        Assert.assertTrue(securePage.checkPopUp());
    }

    @Test
    public void onlyLoginTrueNameLoginTest() {
        SecurePage securePage = openMainPage()
                .goToLoginPage()
                .loginWithInvalidCreds("tomsmith", "");

        String text = securePage.getPageName();
        Assert.assertFalse(text.contains("Secure Area"));
        Assert.assertTrue(securePage.checkPopUp());
    }

    @Test
    public void allEmptyLoginTest() {
        SecurePage securePage = openMainPage()
                .goToLoginPage()
                .loginWithInvalidCreds("", "");

        String text = securePage.getPageName();
        Assert.assertFalse(text.contains("Secure Area"));
        Assert.assertTrue(securePage.checkPopUp());
    }

    @Test
    public void checkCheckBoxTest() {
        CheckBoxPage checkBoxPage = openMainPage().goToCheckBoxPage();
        checkBoxPage.checkCheckBox();
    }

}

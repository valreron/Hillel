package lessons.lesson17;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.annotations.Test;
import pages.RedirectPage;

public class WebElementTest extends BaseTest {
    @Test
    public void webElementTest() {
        RedirectPage redirectPage = openMainPage()
                .goToRedirectPage()
                .openStatusCodes();
        redirectPage.showCodes();
    }
}

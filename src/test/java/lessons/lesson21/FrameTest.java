package lessons.lesson21;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTest extends BaseTest {
    @Test
    public void frameTest() {
        FramePage framePage = openMainPage().goToFramePage();
        framePage.goToIframe();
        framePage.switchToFrame();
        framePage.clearLine();
        framePage.inputInFrame();
    }
}

package lessons.lesson21;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class SelectTest extends BaseTest {
    @Test
    public void selectTest(){
        DropDownPage dropDownPage = openMainPage().goToDropDownPage();
        dropDownPage.selectValue();
    }
}

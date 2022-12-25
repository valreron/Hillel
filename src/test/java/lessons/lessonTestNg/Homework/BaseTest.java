package lessons.lessonTestNg.Homework;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest(alwaysRun = true)
    public void startingTests() {
        System.out.println("Starting test");
    }

    @AfterGroups(groups = {"login"})
    public void asserts() {
        softAssert.assertAll();
    }

    @AfterTest(alwaysRun = true)
    public void endingTests() {
        System.out.println("Ending tests");
    }


}

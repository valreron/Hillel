package lessons.lessonTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        System.out.println("start browser");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        System.out.println("close browser");
    }
}

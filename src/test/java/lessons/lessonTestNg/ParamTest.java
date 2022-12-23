package lessons.lessonTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"param"})
    public void paramTest(String param){
        System.out.println("Running with: " + param);

    }
}

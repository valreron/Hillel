package lessons.lessonTestNg.Homework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OutputTest extends BaseTest{
    @Test
    @Parameters({"info","info1","info2"})
    public void printingInfo(String info,String info1,String info2){
        System.out.println("info: " + info);
        System.out.println("info: " + info1);
        System.out.println("info: " + info2);
    }
}

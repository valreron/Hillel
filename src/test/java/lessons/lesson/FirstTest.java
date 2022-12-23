package lessons.lesson;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 10,dependsOnMethods = "secondTest")
    public void firstTest(){
        System.out.println("Hello AQA");
    }
    @Test
    public void secondTest(){
        System.out.println("OOPS");
    }

}

package lessons.lessonTestNg;

import org.testng.annotations.*;

public class AllMethods {
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before Suite");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("after Test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }
    @AfterSuite
    public void endingWork(){
        System.out.println("after suit");
    }
}

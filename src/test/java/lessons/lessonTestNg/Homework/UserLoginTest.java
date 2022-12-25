package lessons.lessonTestNg.Homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest {

    @Test(dataProvider = "userData", groups = {"login"})
    public void loginTesting(String name, String password, String role) {
        System.out.println("User name: " + name);
        System.out.println("     pass: " + password);
        System.out.println("     role: " + role);

        softAssert.assertNotEquals(role, "CEO", "I'm CEO");

    }

    @DataProvider(name = "userData")
    public Object[][] userDataProvider() {
        return new Object[][]{
                {"Valerii", "0000", "Admin"},
                {"Lexi", "1111", "Client"},
                {"Pavel", "2222", "CEO"},
                {"Ludmila", "3333", "Client"},
                {"Yulia", "0123", "Client"}
        };
    }

    @Test(dependsOnGroups = {"login"})
    public void checks() {
        System.out.println("I'm depend test");
    }

}

package lessons.rozPageComponentTests;

import lessons.homeworkOfLesson18.BaseTest;
import org.testng.annotations.Test;
import pages.RozPage.MainPage;
import pages.RozPage.ProductPage;

public class ComponentTest extends BaseTest {
    @Test
    public void componentTest(){
        MainPage mainPage = new MainPage();
        mainPage.getLastViewedProducts();

        mainPage.header.searchForProduct("Product");

        ProductPage productPage = new ProductPage();
        productPage.header.goToMainPage();

    }
}

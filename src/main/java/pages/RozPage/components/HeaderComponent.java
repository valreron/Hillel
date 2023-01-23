package pages.RozPage.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.RozPage.MainPage;
import pages.RozPage.ProductPage;

public class HeaderComponent {
    private WebElement mainIcon;

    private WebElement catalogButton;

    private WebElement searchInput;

    public MainPage goToMainPage(){
        mainIcon.click();
        return new MainPage();
    }

    public ProductPage  searchForProduct(String product){
        searchInput.sendKeys(product + Keys.ENTER);
        return new ProductPage();
    }

    public void openCatalog(){
        catalogButton.click();
    }
}

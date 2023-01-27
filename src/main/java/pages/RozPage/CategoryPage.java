package pages.RozPage;

import org.openqa.selenium.WebElement;
import pages.RozPage.components.HeaderComponent;
import pages.RozPage.components.ProductCardComponent;

import java.util.List;

public class CategoryPage {
    public HeaderComponent header;

    private List<WebElement> products;

    public CategoryPage(){
        this.header = new HeaderComponent();
    }

    public ProductPage goToProduct(String product){
        //
        return new ProductPage();
    }

    public String getProductTitle(int num){
        return new ProductCardComponent(products.get(num -1)).getTitle();
    }

    public String getProductPrice(int num){
        return new ProductCardComponent(products.get(num -1)).getPrice();
    }
}

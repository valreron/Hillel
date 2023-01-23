package pages.RozPage.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductCardComponent {
//    private WebElement title;
//
//    private WebElement price;
//
//    private WebElement availability;

    private final WebElement parent;

    public ProductCardComponent(WebElement parent) {
        this.parent = parent;
        PageFactory.initElements(parent,this);
    }

    public String getPrice() {
        return parent.findElement(By.cssSelector(".price")).getText();
    }

    public String getTitle() {
        return parent.findElement(By.cssSelector(".title")).getText();
    }

}

package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMainPage {
    public SelenideElement formLink = $(By.linkText("Form Authentication"));

    public SelenideLoginPage goToLoginPage() {
        formLink.shouldBe(Condition.visible).click();
        return new SelenideLoginPage();
    }
}

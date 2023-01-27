package pages.selenidePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenideSecurePage {
    private SelenideElement pageName = $("h2");

    public String getPageName(){
        return pageName.shouldBe(Condition.visible).text();
    }
}

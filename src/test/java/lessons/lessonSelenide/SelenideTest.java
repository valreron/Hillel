package lessons.lessonSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    public void selenideTest(){
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        open("/hovers");
        //Configuration.timeout
        $(".figure").shouldBe(Condition.visible).shouldHave(Condition.text("test")).click();
        $x("");
        $(By.linkText(""));
        System.out.println("done");


    }
}

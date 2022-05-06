package demo.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://testpages.herokuapp.com/styled/index.html")
public class BasePage extends PageObject {

    WebElement htmlFormLink() { return $("#htmlformtest"); }

    @Step
    public void gotoHtmlFormPage(){
        htmlFormLink().click();
    }

}

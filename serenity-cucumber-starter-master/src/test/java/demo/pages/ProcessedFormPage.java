package demo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class ProcessedFormPage extends PageObject {

    WebElement username_value() { return $("#_valueusername");}
    WebElement comments_value() { return $("#_valuecomments");}
    WebElement dropdown_value() { return $("#_valuedropdown");}

    @Step
    public String getUserNameText(){
        return username_value().getText();
    }

    @Step
    public String getCommentsText(){
        return comments_value().getText();
    }

    @Step
    public String getDropDownText(){
        return dropdown_value().getText();
    }

}

package demo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class HtmlFormPage extends PageObject {

    WebElement usernameField(){return $("//input[@name = 'username']");}
    WebElement passwordField(){return $("//input[@name = 'password']");}
    WebElement commentsField(){return $("//textarea[@name = 'comments']");}
    WebElement checkbox(String cbVal) { return $("//input[@type='checkbox'][@value = '"+cbVal+"']");}
    WebElement radioButton(String rbVal) { return $("//input[@type='radio'][@value = '"+rbVal+"']");}

    @FindBy(name="dropdown")
    WebElementFacade selectDropdown;

    WebElement btnSubmit() { return  $("//input[@value = 'submit']"); }

    @Step
    public void fillUpForm(){

        usernameField().click();
        usernameField().sendKeys("demo_user");

        passwordField().sendKeys("demo_pass");

        commentsField().clear();
        commentsField().sendKeys("demo_comment");

        if(!checkbox("cb1").isSelected()){
            checkbox("cb1").click();
        }

        radioButton("rd1").click();

        selectDropdown.selectByVisibleText("Drop Down Item 2");

        btnSubmit().click();
    }

}

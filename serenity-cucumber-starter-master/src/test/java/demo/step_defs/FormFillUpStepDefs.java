package demo.step_defs;

import demo.pages.BasePage;
import demo.pages.ProcessedFormPage;
import demo.pages.HtmlFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FormFillUpStepDefs {

    HtmlFormPage htmlFormPage;
    BasePage basePage;
    ProcessedFormPage processedFormPage;

    @Given("Sergey is on home page")
    public void sergey_is_on_home_page(){
        basePage.open();
    }

    @When("He clicks on html form page link")
    public void he_clicks_on_html_form_page_link(){
        basePage.gotoHtmlFormPage();
    }

    @When("He fills up the form and submits")
    public void he_fills_up_the_form_and_submits() {
        htmlFormPage.fillUpForm();
    }

    @Then("He should see the processed form")
    public void he_should_see_the_processed_form(){
        String username_text = processedFormPage.getUserNameText();
        assertThat(username_text).isEqualTo("demo_user"); //expected values can come from a data source
        assertThat(processedFormPage.getCommentsText()).isEqualTo("demo_comment");
        assertThat(processedFormPage.getDropDownText()).isEqualTo("dd2");
    }

}

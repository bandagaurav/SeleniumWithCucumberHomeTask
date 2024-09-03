package step_definations;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.EmailPage;
import pojo.CreateUserDTO;
import utlity.Utility;

public class StepDefination {
    public static WebDriver driver;
Response response;
    EmailPage emailPage;

    LoginPage loginPage;

    public StepDefination() {
        driver = Hooks.driver;

        emailPage = new EmailPage(driver);
        loginPage = new LoginPage(driver);

    }


    @Given("^User enters Username$")
    public void user_enters_Username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Utility.Wait();
        loginPage.userentersEmail();
        loginPage.userClicksOnNext();
    }

    @Given("^User enters Password$")
    public void user_enters_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.userentersPassword();

    }

    @Given("^User Clicks on login button$")
    public void user_Clicks_on_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.userClicksOnNext();

    }

    @Given("^User clicks on compose tab$")
    public void user_clicks_on_compose_tab() throws Throwable {
        emailPage.clickonComposeButton();
        Utility.Wait();
    }

    @When("^User enters email address$")
    public void user_enters_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userentersEmail();
    }

    @When("^User enters subject$")
    public void user_enters_subject() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userentersSubject();
    }

    @When("^User enters message body$")
    public void user_enters_message_body() throws Throwable {
        emailPage.userentersBody();
    }

    @Then("^User clicks on send button$")
    public void user_clicks_on_send_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userclicksonSendButton();
    }

    @Then("^User validates message sent$")
    public void user_validates_message_sent() throws Throwable {
        emailPage.userValidatesMessageSent();
    }

    @When("^User enters invalid email address$")
    public void user_enters_invalid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userentersInvalidEmail();

    }

    @Then("^User validates error message sent$")
    public void user_validates_error_message_sent() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userValidatesErrorMessageSent();

    }

    @When("^I leave both the subject and email body empty$")
    public void i_leave_both_the_subject_and_email_body_empty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userentersEmptySubjectandEmptyBody();
    }

    @When("^I click the save draft button$")
    public void i_click_the_save_draft_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userclicksonDraft();

    }

    @Then("^I should see a confirmation message that the draft is saved$")
    public void i_should_see_a_confirmation_message_that_the_draft_is_saved() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userValidatesDraft();
    }

    @When("^I leave the subject field blank$")
    public void i_leave_the_subject_field_blank() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userentersEmptySubject();
    }

    @Then("^I should see an error message indicating the subject is required$")
    public void i_should_see_an_error_message_indicating_the_subject_is_required() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        emailPage.userValidatesErrorMessageSubject();

    }


    @Given("^go to the website url$")
    public void go_to_the_website_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RestAssured.baseURI="https://reqres.in";
    }

    @When("^you will make get request to login$")
    public void you_will_make_get_request_to_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
response=RestAssured.given().contentType(ContentType.JSON).queryParam("page",2).get("/api/users").thenReturn();
Assert.assertEquals(response.statusCode(),HttpStatus.SC_OK);
System.out.println("Get Request Output :"+response.getBody().asString());
Hooks.scenario.write("Get Request Output :"+response.getBody().asString());
        CreateUserDTO createUserDTO=new CreateUserDTO();
        createUserDTO.setName("Gaurav");
        createUserDTO.setJob("Engineer");
        ObjectMapper objectMapper=new ObjectMapper();
response=RestAssured.given().contentType(ContentType.JSON).body(objectMapper.writeValueAsString(createUserDTO)).post("/api/users").thenReturn();
        Assert.assertEquals(response.statusCode(),HttpStatus.SC_CREATED);
        Hooks.scenario.write("Post Request Output :"+response.getBody().asString());

System.out.println("Post Request Output :"+response.getBody().asString());

         createUserDTO=new CreateUserDTO();
        createUserDTO.setName("Saurav");
        createUserDTO.setJob("Engineer");
response=RestAssured.given().contentType(ContentType.JSON).pathParams("id",2).body(objectMapper.writeValueAsString(createUserDTO)).put("/api/users/{id}").thenReturn();
        Assert.assertEquals(response.statusCode(),HttpStatus.SC_OK);
        Hooks.scenario.write("Put Request Output :"+response.getBody().asString());

        System.out.println("Put Request Output :"+response.getBody().asString());



    }

    @Then("^you should get (\\d+) status code$")
    public void you_should_get_status_code(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(response.statusCode(), HttpStatus.SC_OK);
    }


}




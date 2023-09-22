package starter.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedinLoginSteps {
    // Valid Login
    @Given("I go to Login Page")
    public void goToLoginPage(){
        System.out.println("I am in Login Page");
    }

    @When("I input valid username and valid password")
    public void inputValidUsernameAndValidPassword(){
        System.out.println("input username");
        System.out.println("input password");
    }

    @And("Click login button")
    public void clickLoginButton(){
        System.out.println("Click login button");
    }

    @Then("I go to homepage")
    public void goToHomepage(){
        System.out.println("I am in homepage");
    }

    // Invalid Login (Valid Username, Invalid Password)
    @When("I input valid username and invalid password")
    public void inputValidUsernameAndInvalidPassword() {
        System.out.println("Invalid Password");
    }

    @Then("I will get an error message invalid password")
    public void getErrorMessageInvalidPassword() {
        System.out.println("Incorrect Password. Please Try Again.");
    }

    // Invalid Login (Invalid Username, Valid Password)
    @When("I input invalid username and valid password")
    public void inputInvalidUsernameAndValidPassword() {
        System.out.println("Invalid Username");
    }

    @Then("I will get error message invalid username")
    public void getErrorMessageInvalidUsername() {
        System.out.println("Cannot find a LinkedIn account associated with this email address. Please try again. ");
    }
}

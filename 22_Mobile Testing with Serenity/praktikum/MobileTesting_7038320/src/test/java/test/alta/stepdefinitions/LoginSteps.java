package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("User on the Login Page")
    public void onLoginPage(){
        Assert.assertTrue(loginPage.isOnLoginPage());
    }

    @When("User input {string} on Email Field")
    public void inputEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("User input {string} on Email Field")
    public void inputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("User click Login Button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User see Error Message {string}")
    public void validateErrorMessage(String message) {
        Assert.assertEquals(message, loginPage.getErrorMessage());
    }
}

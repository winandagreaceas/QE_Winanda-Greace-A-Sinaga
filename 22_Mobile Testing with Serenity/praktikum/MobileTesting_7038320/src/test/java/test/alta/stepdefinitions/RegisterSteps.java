package test.alta.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en. When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginPage;
import test.alta.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("New User on the Login Page")
    public void isOnLoginPage(){
        loginPage.isOnLoginPage();
    }

    @When("New User click Register Link")
    public void clickRegisterLink(){
        registerPage.clickRegisterLink();
    }

    @And("New User input Name on Name Field")
    public void inputNameField(){
        registerPage.inputNameField();
    }

    @And("New User input Email on Email Field")
    public void inputEmailField(){
        registerPage.inputEmailField();
    }

    @And("New User input Password on Password Field")
    public void inputPasswordField(){
        registerPage.inputPasswordField();
    }

    @And("New User confirm Password")
    public void confirmPassword(){
        registerPage.confirmPassword();
    }

    @And("New User click Register Button")
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Then("New User can view Success Message {String}")
    public void validateSuccessMessage(String message){
        Assert.assertEquals(message, registerPage.validateSuccessMessage());
    }
}

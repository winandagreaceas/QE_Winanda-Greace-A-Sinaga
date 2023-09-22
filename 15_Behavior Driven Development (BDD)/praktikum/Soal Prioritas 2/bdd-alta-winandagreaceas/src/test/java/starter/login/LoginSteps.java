package starter.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I go to Homepage")
    public void goToHomePage(){
        System.out.println("Currently, you are still a guest, let's log into your account");
    }

    @When("Click the login button to go to the login page")
    public void clickButtonToGoToLoginPage(){
        System.out.println("Come on, log in with your e-mail or cellphone number to stay connected with us :)");
    }

    @And("I input valid username and valid password")
    public void inputValidUsernameAndValidPassword(){
        System.out.println("input username");
        System.out.println("input password");
    }

    @And("Click Login Button")
    public void clickLoginButton(){
        System.out.println("Click login button");
    }

    @Then("I go to Homepage")
    public void goToHomepage(){
        System.out.println("I am in Homepage");
    }
}

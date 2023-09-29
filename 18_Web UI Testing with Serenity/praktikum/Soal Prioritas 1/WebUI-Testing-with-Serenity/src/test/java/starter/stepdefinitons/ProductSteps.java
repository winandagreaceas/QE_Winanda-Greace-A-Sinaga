package starter.stepdefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Homepage;
import starter.pages.ProductPage;

public class ProductSteps {

    @Steps
    Homepage homepage;

    @Steps
    ProductPage productPage;

    @Given("I am on homepage")
    public void onHomepage(){
        homepage.validateOnHomePage();
    }

    @When("I click on the name of product")
    public void clickNameOfProduct(){
        productPage.clickNameOfProduct();
    }

    @Then("I am on the Product Page")
    public void onTheProductPage(){
        productPage.validateOnProductPage();
    }
}

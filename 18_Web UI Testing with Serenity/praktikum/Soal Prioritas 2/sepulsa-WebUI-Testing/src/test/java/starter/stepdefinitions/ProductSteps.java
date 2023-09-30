package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Homepage;
import starter.pages.ProductsPage;

public class ProductSteps {

    @Steps
    Homepage homepage;

    @Steps
    ProductsPage productsPage;

    @Given("I am on the Home Page")
    public void onHomepage(){
        homepage.open();
        homepage.validateOnHomepage();
    }

    @When("I click on others")
    public void clickOthers(){
        productsPage.clickOnOthers();
    }

    @Then("I am on the All Products Page")
    public void onProductsPage(){
        productsPage.validateOnProductsPage();
    }
}

package starter.pilihproduk;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PilihProdukSteps {
    @Given("I go to the Homepage")
    public void iGoToHomepage() {
        System.out.println("Currently, you are still a guest, let's log into your account");
    }

    @When("I click Credit as the product to buy")
    public void clickCreditAsProduct() {
        System.out.println("Top up the credit page");
    }

    @And("I input Phone Number")
    public void inputPhoneNumber(){
        System.out.println("Input Phone Number");
    }

    @And("I input the number of products you want to buy")
    public void inputNumberOfProducts(){
        System.out.println("Input Quantity of Product");
    }

    @Then("I click Pay Now to proceed")
    public void clickPayNow(){
        System.out.println("Click Pay Now Button");
    }
}

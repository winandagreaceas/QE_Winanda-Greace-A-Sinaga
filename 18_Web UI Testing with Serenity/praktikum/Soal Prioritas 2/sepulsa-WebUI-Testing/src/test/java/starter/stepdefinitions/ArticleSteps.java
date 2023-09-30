package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArticlePage;
import starter.pages.Homepage;

public class ArticleSteps {
    @Steps
    Homepage homepage;

    @Steps
    ArticlePage articlePage;

    @Given("I am on the Home Page")
    public void onTheHomePage() {
        homepage.openPage();
        homepage.validateOnHomepage();
    }

    @When("I click on an article")
    public void clickOnAnArticle(){
        articlePage.clickOnArticle();
    }

    @Then("I am on the Article Page")
    public void onTheArticlePage(){
        articlePage.validateOnArticlePage();
    }
}

package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By linkName(){
        return By.id("item_4_title_link");
    }

    private By onPointTitle(){
        return By.className("back-to-products");
    }

    @Step
    public void clickNameOfProduct(){
        $(linkName()).click();
    }

    @Step
    public void validateOnProductPage(){
        $(onPointTitle()).isDisplayed();
    }
}

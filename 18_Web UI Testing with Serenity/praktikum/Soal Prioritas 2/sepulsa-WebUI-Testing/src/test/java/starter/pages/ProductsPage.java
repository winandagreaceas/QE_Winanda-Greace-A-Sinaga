package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    private By other() {
        return org.openqa.selenium.By.id("Ellipse");
    }

    private By subTitle(){
        return By.id("Telekomunikasi");
    }

    @Step
    public void clickOnOthers(){
        $(other()).click();
    }
    @Step
    public boolean validateOnProductsPage(){
        return $(subTitle()).isDisplayed();
    }


}

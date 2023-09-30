package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Homepage extends PageObject {
    private By header(){
        return By.className("80.316");
    }

    @Step
    public void openPage(){
        open();
    }
    @Step
    public void validateOnHomepage(){

        $(header()).isDisplayed();
    }
}

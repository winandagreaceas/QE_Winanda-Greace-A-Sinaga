package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ArticlePage extends PageObject {
    private By article() {
        return By.id("gambar Kuota Belajar Telkomsel: Ini Cara untuk Mendapatkannya!");
    }

    private By blogHead(){
        return By.id("show-when-scroll");
    }

    @Step
    public void clickOnArticle(){
        $(article()).click();
    }

    @Step
    public boolean validateOnArticlePage(){
        return $(blogHead()).isDisplayed();
    }
}

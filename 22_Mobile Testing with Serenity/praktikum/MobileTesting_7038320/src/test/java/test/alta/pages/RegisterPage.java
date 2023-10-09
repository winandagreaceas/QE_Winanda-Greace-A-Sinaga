package test.alta.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterPage extends BasePageObject {
    public String name = "";
    public String password = "";

    private By registerLink(){
        return MobileBy.id("textViewLinkRegister");
    }

    private By nameField(){
        return MobileBy.id("textInputEditTextName");
    }

    private By emailField(){
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField(){
        return MobileBy.id("textInputEditTextPassword");
    }

    private By confirmPasswordField(){
        return MobileBy.id("textInputEditTextConfirmPassword");
    }

    private By registerButton(){
        return MobileBy.id("appCompatButtonRegister");
    }

    private By snackbarMessage(){
        return MobileBy.id("snackbar_text");
    }

    @Step
    public void clickRegisterLink(){
        onClick(registerLink());
    }

    @Step
    public void inputNameField(){
        Faker faker = new Faker();
        name = faker.name().firstName();
        onType(nameField(), name);
    }

    @Step
    public void inputEmailField(){
        onType(emailField(), name + "@gmail.com");
    }

    @Step
    public void inputPasswordField(){
        onType(passwordField(), password);
    }

    @Step
    public void confirmPassword(){
        onType(confirmPasswordField(), password);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public  String validateSuccessMessage(){
        return waitUntilVisible(snackbarMessage()).getText();
    }

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

}

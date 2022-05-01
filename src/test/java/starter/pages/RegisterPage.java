package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
// GET SELECTOR
    private By buttonSignin(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");
    }

    private By textRegister(){
        return By.xpath("//*[@href=\"/auth/register\"]");
    }

    private By nameField(){
        return By.xpath("//*[label[text() = 'Nama Lengkap']]/input");
    }

    private By emailField(){
        return By.xpath("//*[label[text() = 'Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text() = 'Password']]/input");
    }

    private By registerButton(){
        return By.cssSelector("button[class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary'] span[class='v-btn__content']");
    }

//    Selector Get Alert in Register
    private By errorMessage() {
        return By.xpath("//*[@class='v-alert__wrapper']");
//        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div");
    }

    private By alertField() {
        return By.className("v-alert__icon");
    }

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl("https://qa.alta.id/");
    }

    @Step
    public void clickLoginSignin(){
        $(buttonSignin()).click();
    }

    @Step
    public void clickTextRegister(){
        $(textRegister()).click();
    }

    @Step
    public void inputName(String name){
        $(nameField()).type(name);
    }

    @Step
    public void inputEmail(String email){ $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){ $(passwordField()).type(password); }

    @Step
    public void clickButtonRegister(){
        $(registerButton()).click();
    }


    //  Alert in Register Page
    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorFieldAlert(){
        return $(alertField()).isSelected();
    }
}


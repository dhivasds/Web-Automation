package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
// GET SELECTOR
    private By buttonLogin(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");
    }

    private By textRegister(){
        return By.xpath("//*[@href=\"/auth/register\"]");
    }

    private By nameField(){
        return By.xpath("//*[@id='input-115']");
    }

    private By emailField(){
        return By.xpath("//*[@id='input-21']");
    }

    private By passwordField(){
        return By.xpath("//*[@class = 'v-label theme--light' and text() = 'Password']");
    }

    private By registerButton(){
        return By.cssSelector("button[class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary'] span[class='v-btn__content']");
    }

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl("https://qa.alta.id/");
    }

    @Step
    public void clickLoginButton(){
        $(buttonLogin()).click();
    }

    @Step
    public void clickTextRegister(){
        $(textRegister()).click();
    }

    @Step
    public void inputNama(String nama){
        $(nameField()).type(nama);
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
}

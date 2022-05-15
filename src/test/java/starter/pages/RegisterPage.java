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


//   Selector Alert in Register
    private By duplicateEmail() { return By.xpath("//div[text()=' ERROR: duplicate key value violates unique constraint \"users_email_key\" (SQLSTATE 23505) ']");}
    private By nullFullname() { return By.xpath("//div[text()=' fullname is required ']");}
    private By nullEmail(){ return By.xpath("//div[text()=' email is required ']");}
    private By nullPassword() { return By.xpath("//div[text()=' password is required ']");}


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
    public void inputName(String name){$(nameField()).type(name);}

    @Step
    public void inputEmail(String email){ $(emailField()).type(email);}

    @Step
    public void inputPassword(String password){ $(passwordField()).type(password); }

    @Step
    public void clickButtonRegister(){
        $(registerButton()).click();
    }


    //  Equals Alert in Register Page
    @Step
    public boolean errorDuplicateEmailAppers() { return $(duplicateEmail()).isDisplayed();}
    @Step
    public boolean errorDuplicateEmailEquals() { return $(duplicateEmail()).equals("ERROR: duplicate key value violates unique constraint \"users_email_key\" (SQLSTATE 23505)");}

    @Step
    public boolean errorNullFullnameAppers(){ return $(nullFullname()).isDisplayed();}
    @Step
    public boolean errorNullFullnameEquals(){ return $(nullFullname()).equals("fullname is required");}

    @Step
    public boolean errorNullEmailAppers(){ return $(nullEmail()).isDisplayed();}
    @Step
    public boolean errorNullEmailEquals(){ return $(nullEmail()).equals("email is required");}

    @Step
    public boolean errorNullPasswordAppers(){ return $(nullPassword()).isDisplayed();}
    @Step
    public boolean errorNullPasswordEquals(){ return $(nullPassword()).equals("password is required");}
}


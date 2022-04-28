package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
//    ====== SELECTOR ==========

    //    Login Page
    private By loginButton() { return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");}

    // Get Login Title for equals
    private By cardLoginTitle() {return By.xpath("//div[text() = 'Login']");}

    // Get Equals "select category" for equals in login steps

//    ---- EQUALS SELECT Category -----
    private By fieldCategory(){ return By.xpath("//div[@class='v-select__slot']");}
    private By categorySelected(){ return By.xpath("//label[text()='Select category ...']");}
//    -----------------

//    ---EQUALS ICON PROFILE----
    private By iconProfile(){ return By.xpath("//*[@class='v-icon notranslate fas fa-user theme--dark']");}
//    -------
    // Equals Alert Field
      private By errorMessage(){ return By.xpath("//*[@class='v-alert__content']");}

//  Register Page
    @Step
    public boolean titleAppers(){
        return $(cardLoginTitle()).isDisplayed();
    }

    @Step
    public boolean titleTextEqual() { return $(cardLoginTitle()).equals("Login");}

//  Login Page
    @Step
    public void clickButtonLogin(){ $(loginButton()).click();}

// Product List Page
//    ------ CATEGORY SELECTED EQUALS ----------
//    @Step
//    public boolean categorySelectedAppers(){ return $(categorySelected()).isDisplayed();}
//    @Step
//    public boolean categorySelectedEquals(){ return $(categorySelected()).getText().equals("Select category ...");}
//    ----------------------------------

//    ----- ICON PROFILE EQUALS -----------
    @Step
    public boolean iconProfileAppers(){ return $(iconProfile()).isDisplayed();}

    @Step
    public boolean iconProfileEquals(){ return $(iconProfile()).equals(iconProfileAppers());}
//    -----------------------------------

    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
    }

}

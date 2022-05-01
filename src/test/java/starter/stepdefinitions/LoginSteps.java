package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @And("I click button login")
    public void iClickButtonLogin() {
        loginPage.clickButtonLogin();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {

        if (result.equals("email is required")) {
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }else if (result.equals("password is required")){
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }else if(result.equals("email or password is invalid")) {
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }else if(result.equals("record not found")) {
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }else{
                loginPage.iconProfileAppers();
                loginPage.iconProfileEquals();
            }
        }
    }


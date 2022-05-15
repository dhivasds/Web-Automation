package starter.stepdefinitions;

import Utils.General;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;



public class RegisterSteps {

    @Steps
    RegisterPage registerPage;

    @Steps
    General general;

    @Steps
    LoginPage loginPage;

    @Given("I am on the homepage page")
    public void iAmOnTheHomepagePage() {
        registerPage.openUrl("https://qa.alta.id/");
    }

    @When("I click button signin")
    public void iClickButtonSignin() {
        registerPage.clickLoginSignin();
    }

    @And("I click text register")
    public void iClickTextRegister() {
        registerPage.clickTextRegister();
    }

    @And("I Input {string} name")
    public void iInputName(String name) {
        if (name.equals("randomName")){
            registerPage.inputName(general.randomName(name));
        }else{
            registerPage.inputName(name);
        }
    }

    @And("I input {string} email")
    public void iInputEmail(String email) {
        if (email.equals("randomEmail")){
            registerPage.inputEmail(general.randomEmail(email));
        }else {
            registerPage.inputEmail((email));
        }
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        registerPage.inputPassword(password);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickButtonRegister();
    }


    @Then("I get result {string}")
    public void iRedirectTo(String result) {
        if (result.equals("redirectLogin")){
            loginPage.titleAppers();
            loginPage.titleTextEqual();
        }else if (result.equals("duplicateEmail")){
            registerPage.errorDuplicateEmailAppers();
            registerPage.errorDuplicateEmailEquals();
        }else if (result.equals("nullFullname")){
            registerPage.errorNullFullnameAppers();
            registerPage.errorNullFullnameEquals();
        }else if (result.equals("nullEmail")){
            registerPage.errorNullEmailAppers();
            registerPage.errorNullEmailEquals();
        }else {
            registerPage.errorNullPasswordAppers();
            registerPage.errorNullPasswordEquals();
        }

    }

}

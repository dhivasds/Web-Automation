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

    @And("I Input {string} nama")
    public void iInputNama(String nama) {
        registerPage.inputNama(nama);
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


    @Then("I redirect to {string}")
    public void iRedirectTo(String page) {
        if (page.equals("Login")){
            loginPage.titleAppers();
            loginPage.titleTextEqual();
        }else {
            // GET SELECTOR BUAT BUTTON ERROR ALERT
            registerPage.errorMessageAppears();
            registerPage.errorFieldAlert();
        }

    }

}

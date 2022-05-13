package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.RegisterPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;
    @Steps
    LoginPage loginPage;

    @When("I click button profile")
    public void iClickButtonProfile() {
        logoutPage.clickButtonProfile();
    }

    @And("I click button Logout")
    public void iClickButtonLogout() {
        logoutPage.clickButtonLogout();
    }

    @Then("I redirect to login")
    public void iRedirectToLogin() {
        loginPage.titleAppers();
        loginPage.titleTextEqual();

    }
}

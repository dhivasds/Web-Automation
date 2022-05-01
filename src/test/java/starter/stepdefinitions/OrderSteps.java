package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.ProductListPage;
import starter.pages.RegisterPage;

public class OrderSteps {
    OrderPage orderPage;
    RegisterPage registerPage;
    LoginPage loginPage;
    ProductListPage productListPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        orderPage.openUrl("https://qa.alta.id/auth/login");
        registerPage.inputEmail("a");
        registerPage.inputPassword("a");
        loginPage.clickButtonLogin();
    }

    @And("I click button cart")
    public void iClickButtonCart() {
        orderPage.clickButtonCart();
    }


    @And("I click button {string}")
    public void iClickButton(String buttonPlusMin) {
        if (buttonPlusMin.equals("+")){
            orderPage.clickIconPlus();
        }else{
            orderPage.clickIconMin();
        }
    }

    @Then("I get result product {string}")
    public void iGetResultProduct(String result) {
        if (result.equals("increase")){
            orderPage.tQtyAppers();
            orderPage.tQtyEquals(result);
        }else if(result.equals("decincrease")){
            productListPage.textProductEmptyAppers();
            productListPage.textProdctEmptyEquals(result);
        }else {
            orderPage.textTotalAppers();
            orderPage.textTotalEquals(result);
        }

    }

}

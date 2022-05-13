package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductListPage;

public class ProductListSteps {
    @Steps
    ProductListPage productListPage;

    @When("I click button BELI")
    public void iClickButtonBELI() {
        productListPage.clickButtonBeli();
    }

    @Then("product successfully added to cart")
    public void productSuccessfullyAddedToCart() {
        productListPage.numberProductAppers();
        productListPage.numberProductEquals();
    }

    @When("I click dropdown select category")
    public void iClickDropdownSelectCategory() {
        productListPage.clickDropdownCategory();
    }

//    @And("I click category")
//    public void iClickCategory() {
//        productListPage.clickItemsCategoryEmpty();
//    }

    @And("I click category {string}")
    public void iClickCategory(String cProduct) {
        if (cProduct.equals("kesehatan")){
            productListPage.clickItemsCategoryEmpty();
        }else {
            productListPage.scrollMenuCategory();
            productListPage.clickItemsCategoryCovid();
        }
    }

    @Then("I get {string}")
    public void iGet(String pEmpty) {
        productListPage.textProductEmptyAppers();
        productListPage.textProdctEmptyEquals(pEmpty);
    }


    @And("I click button close")
    public void iClickButtonClose() {
        productListPage.clickButtonClose();
    }

    @Then("I redirect to product list")
    public void iRedirectProductList() {
        productListPage.buttonBeliAppers();
        productListPage.buttonBeliEquals();
    }
}

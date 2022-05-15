package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.DetailProductPage;

public class DetailProductSteps {

    DetailProductPage detailProductPage;

    @When("I click button Detail")
    public void iClickButtonDetail() {
        detailProductPage.clickButtonDetail();
    }

    @Then("get result product detail")
    public void getResultProductDetail() {
        detailProductPage.cardTextProductAppers();
        detailProductPage.cardTextProductEquals();
    }

    @And("I click button 3-star")
    public void iClickButton3Star() {
        detailProductPage.clickButton3Star();
    }

    @And("I click button 1-star")
    public void iClickButton1Star() {
        detailProductPage.clickButton1Star();
    }

    @Then("the star on the product changes to 3")
    public void theStarOnTheProductChangesTo3() {
        detailProductPage.ranting3ProductAppers();
        detailProductPage.ranting3ProductEquals();
    }

    @Then("the star on the product changes to 1")
    public void theStarOnTheProductChangesTo1() {
        detailProductPage.ranting1ProductAppers();
        detailProductPage.ranting1ProductEquals();
//      Equals not change
    }
}

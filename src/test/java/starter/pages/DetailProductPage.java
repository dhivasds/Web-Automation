package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {
//  Selector
    private By buttonDetail(){ return By.xpath("//button[contains(@class,'button-beli v-btn')]");}
    private By button3Star() { return By.cssSelector("button[aria-label='Rating 3 of 5']");}
    private By button1Star() { return By.cssSelector("button[aria-label='Rating 1 of 5']");}
    private By headerTextProduct() { return By.cssSelector(".text-h4.text--primary");}
    private By rantingProduct() { return By.xpath("//span[text()=' (2) ']");}


    @Step
    public void clickButtonDetail() { $(buttonDetail()).click();}
    @Step
    public void clickButton3Star() { $(button3Star()).click();}
    @Step
    public void clickButton1Star() { $(button1Star()).click();}


//   Equals Detail Products
    public void cardTextProductAppers(){ $(headerTextProduct()).isDisplayed();}
    public void cardTextProductEquals(){ $(headerTextProduct()).equals("Tensi Darah Elektrik");}
//   Equals Ranting Give Ranting 3 Star
    public void ranting3ProductAppers() { $(rantingProduct()).getText();}
    public void ranting3ProductEquals() { $(rantingProduct()).equals(3);}
//   Equals Ranting Give Ranting 1 Star
    public void ranting1ProductAppers() { $(rantingProduct()).getText();}
    public void ranting1ProductEquals() { $(rantingProduct()).equals(1);}


}

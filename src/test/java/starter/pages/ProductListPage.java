package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class ProductListPage extends PageObject {
//    SELECTOR
    private By buttonBeli(){ return By.cssSelector("div[id='519'] button:nth-child(2)");}
    private By numberCart(){ return By.xpath("//span[@aria-label='Badge']"); }
    private By dropdownCategory() { return By.cssSelector(".v-input__icon.v-input__icon--append");}
    private By itemsCategoryEmpty() { return By.xpath("(//div[@class='v-list-item__title'][normalize-space()='kesehatan'])[1]");}
    private By textProductEmpty() { return By.xpath("//div[@class='v-alert__content']");}
    private By itemsCategoryCovid() { return By.xpath("//div[contains(text(),'Covid-19')]");}
    private By buttonClose() { return By.cssSelector("button[aria-label='clear icon']");}

//  Menu Category Scroll (Test) //ga kepake
    private By menuCategory(){ return By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']");}

    @Step
    public void clickButtonBeli(){ $(buttonBeli()).click(); }
    @Step
    public void clickDropdownCategory(){ $(dropdownCategory()).click();}
    @Step
    public void clickItemsCategoryEmpty(){ $(itemsCategoryEmpty()).click();}
    @Step
    public void scrollMenuCategory(){$(menuCategory()).click(); to(menuCategory());} //ga kepake
    @Step
    public void clickItemsCategoryCovid(){$(itemsCategoryCovid()).click();} //ga kepake
    @Step
    public void clickButtonClose(){$(buttonClose()).click();}


//    EQUALS number product
    @Step
    public void numberProductAppers(){ $(numberCart()).isDisplayed();}
    @Step
    public void numberProductEquals(){ $(numberCart()).getText().equals("1");}

//    Equals Text Product Empty
    @Step
    public void textProductEmptyAppers(){ $(textProductEmpty()).isDisplayed();}
    @Step
    public void textProdctEmptyEquals(String text){ $(textProductEmpty()).getText().equals(text);}

//    Equals Product Displayed
    @Step
    public void buttonBeliAppers(){ $(buttonBeli()).isDisplayed();}
    @Step
    public void buttonBeliEquals(){ $(buttonBeli()).equals("BELI");}
}

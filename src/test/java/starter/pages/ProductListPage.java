package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class ProductListPage extends PageObject {
//    SELECTOR
    private By buttonBeli(){ return By.cssSelector("div[id='110'] button[type='button']");}
    private By numberCart(){ return By.xpath("(//span[@aria-label='Badge'])[1]"); }
    private By dropdownCategory() { return By.cssSelector(".v-input__icon.v-input__icon--append");}
    private By itemsCategoryEmpty() { return By.xpath("//div[@id='list-item-183-0']//div[@class='v-list-item__content']");}
    private By textProductEmpty() { return By.xpath("//div[@class='v-alert__content']");}
    private By itemsCategoryCovid() { return By.xpath("//div[contains(text(),'Covid-19')]");}

//    TEST
    private By menuCategory(){ return By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']");}

    @Step
    public void clickButtonBeli(){ $(buttonBeli()).click(); }
    @Step
    public void clickDropdownCategory(){ $(dropdownCategory()).click();}
    @Step
    public void clickItemsCategoryEmpty(){ $(itemsCategoryEmpty()).click();}
    @Step
    public void scrollMenuCategory(){$(menuCategory()).click(); to(menuCategory());}
    @Step
    public void clickItemsCategoryCovid(){$(itemsCategoryCovid()).click();}


//    EQUALS number product
    @Step
    public void numberProductAppers(){ $(numberCart()).isDisplayed();}
    @Step
    public void numberProductEquals(){ $(numberCart()).getText().equals("2");} // GET FIX yang ke equals bukan nomer

//    Equals Text Product Empty
    @Step
    public void textProductEmptyAppers(){ $(textProductEmpty()).isDisplayed();}
    @Step
    public void textProdctEmptyEquals(String text){ $(textProductEmpty()).getText().equals(text);} // belom ke equals textnya
}

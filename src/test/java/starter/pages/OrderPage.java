package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
//    ======= SELECTOR =======
    private By buttonCart(){ return By.xpath("(//button[@type='button'])[1]");}
    private By textTotal() { return By.xpath("//div[contains(text(),'Total Bayar')]");}
    private By iconPlus(){ return By.xpath("//main[@class='v-main']//button[2]");}
    private By iconMin(){ return By.xpath("(//button[@type='button'])[3]");}
    private By tQty() { return By.xpath("(//div[@class='v-list-item__icon'])[2]");}


    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl("https://qa.alta.id/auth/login");
    }

    @Step
    public void clickButtonCart(){ $(buttonCart()).click();}

    @Step
    public void clickIconPlus() { $(iconPlus()).click();}

    @Step
    public void clickIconMin() { $(iconMin()).click();}
//  Equals Icon +
    @Step
    public void tQtyAppers(){ $(tQty()).isDisplayed();}
    @Step
    public void tQtyEquals(String result){ $(tQty()).equals(result);}
//  Equals Icon -


//  Equals Total Bayar
    @Step
    public void textTotalAppers(){ $(textTotal()).isDisplayed();}

    @Step
    public void textTotalEquals(String result){ $(textTotal()).getText().equals("Total Bayar");}
}

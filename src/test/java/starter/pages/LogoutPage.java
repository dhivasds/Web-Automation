package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

//    SELECTOR
    private By buttonProfile(){ return By.cssSelector("button[role='button']");}
    private By buttonLogout(){ return By.xpath("(//div[contains(text(),'Logout')])[1]");}

    @Step
    public void clickButtonProfile(){ $(buttonProfile()).click();}
    @Step
    public void clickButtonLogout(){ $(buttonLogout()).click();}

}

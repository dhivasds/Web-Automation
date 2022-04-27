package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    // Get Login Title for equals
    private By cardLoginTitle() {return By.xpath("//div[text() = 'Login']");}

    @Step
    public boolean titleAppers(){
        return $(cardLoginTitle()).isDisplayed();
    }

    @Step
    public boolean titleTextEqual() { return $(cardLoginTitle()).equals("Login");}
}

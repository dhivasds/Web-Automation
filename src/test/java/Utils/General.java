package Utils;

import net.serenitybdd.core.pages.PageObject;

import java.util.Random;

public class General extends PageObject {
    Random rand = new Random();

    public String randomEmail(String email) { return "dhivas"+rand.nextInt(300)+"@gmail.com"; }
}

package Utils;

import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.PageObject;

import java.util.Locale;
import java.util.Random;

public class General extends PageObject {
    Random rand = new Random();
    Faker faker = new Faker(new Locale("in-ID"));


    public String randomEmail(String email) { return faker.name().firstName()+rand.nextInt(300)+"@gmail.com"; }

    public String randomName(String name) { return faker.name().fullName(); }

}

package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.FooterEnglishPrime;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class WebsiteMapButton extends TestInit {
    FooterEnglishPrime footerEnglishPrime;
    @Test
    public void websiteMapButton(){
        driver.get("https://englishprime.ua/");
        footerEnglishPrime = new FooterEnglishPrime(driver);
        footerEnglishPrime.websiteMapButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("maps"));
    }
}

package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.FooterEnglishPrime;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FacebookLinkButton extends TestInit {
    FooterEnglishPrime footerEnglishPrime;
    @Test
    public void facebookLinkButton(){
        driver.get("https://englishprime.ua/");
        footerEnglishPrime = new FooterEnglishPrime(driver);
        footerEnglishPrime.facebookLinkButton().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
    }
}

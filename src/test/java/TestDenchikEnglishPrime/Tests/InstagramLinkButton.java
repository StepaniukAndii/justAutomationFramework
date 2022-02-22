package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.FooterEnglishPrime;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class InstagramLinkButton extends TestInit {
    FooterEnglishPrime footerEnglishPrime;
    @Test
    public void instagramLinkButton(){
        driver.get("https://englishprime.ua/");
        footerEnglishPrime = new FooterEnglishPrime(driver);
        footerEnglishPrime.instagramLinkButton().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram"));
    }
}

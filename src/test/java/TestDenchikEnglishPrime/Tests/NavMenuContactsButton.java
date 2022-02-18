package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavMenuContactsButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void navMenuContactsButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        landingPageEnglishPrime.navMenuContactsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }
}

package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavMenuSpeakingClubButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void navMenuSpeakingClubButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        landingPageEnglishPrime.navMenuSpeakingClubButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("english-speaking-club-kiev"));
    }
}

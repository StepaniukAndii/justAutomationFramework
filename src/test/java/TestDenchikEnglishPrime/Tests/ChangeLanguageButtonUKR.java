package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageButtonUKR extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void changeLanguageButtonUKR(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        WebElement element = landingPageEnglishPrime.changeLanguageButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        landingPageEnglishPrime.ukrLanguageButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("uk"));
    }
}

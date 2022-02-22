package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutSchoolDropDownListMethodButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void aboutSchoolDropDownListMethodButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        WebElement element = landingPageEnglishPrime.navMenuAboutSchoolButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        landingPageEnglishPrime.aboutSchoolDropDownListMethodButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("metodika"));
    }
}

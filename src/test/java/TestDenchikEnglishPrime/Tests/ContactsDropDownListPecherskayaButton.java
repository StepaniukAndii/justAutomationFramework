package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDropDownListPecherskayaButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void contactsDropDownListPecherskayaButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        WebElement element = landingPageEnglishPrime.navMenuContactsButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        landingPageEnglishPrime.contactsDropDownListPecherskayaButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("kursy-anglijskogo-yazyka-na-metro-pecherskaya"));
    }
}

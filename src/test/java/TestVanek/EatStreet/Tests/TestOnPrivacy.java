package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnPrivacy extends TestInit{
    StartPage startPage;
    @Test
    public void testOnPrivacy(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com");
        startPage.gotItBtn().click();
        startPage.privacyBtn().click();
        Boolean wait = new WebDriverWait(driver,10).until(ExpectedConditions.urlContains("/privacy"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://eatstreet.com/privacy");
    }
}

package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAboutUs extends TestInit {
    StartPage startPage;

    @Test
    public void testAboutUs(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.aboutUsBtn().click();
        Boolean wait = new WebDriverWait(driver,10).until(ExpectedConditions.urlContains("/about-us"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://eatstreet.com/about-us");
    }
}

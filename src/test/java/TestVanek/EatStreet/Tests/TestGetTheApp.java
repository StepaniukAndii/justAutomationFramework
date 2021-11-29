package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGetTheApp extends TestInit {
    StartPage startPage;
    @Test
    public void testGetTheApp(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.getTheAppBtn().click();
        Assert.assertEquals("https://eatstreet.com/get-the-app",driver.getCurrentUrl());
    }
}

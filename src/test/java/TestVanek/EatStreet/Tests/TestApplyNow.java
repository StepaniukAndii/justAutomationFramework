package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApplyNow extends TestInit {
    StartPage startPage;
    @Test
    public void testApplyNow(){
    startPage = new StartPage(driver);
    openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.applyNowBtn().click();
        Assert.assertEquals("https://eatstreet.com/driver-careers",driver.getCurrentUrl());
    }
}

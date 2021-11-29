package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUpResraurant extends TestInit {
    StartPage startPage;
    @Test
    public void testSignUpRestaurant(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.learnMoreBtn().click();
        Assert.assertEquals("http://geteatstreet.com/",driver.getCurrentUrl());
    }
}

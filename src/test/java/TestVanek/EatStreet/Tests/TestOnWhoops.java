package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnWhoops extends TestInit {
    StartPage startPage;
    @Test
    public void testOnWhoops(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.emailInput().sendKeys("something invalid");
        startPage.emailSignInBtn().click();
        Assert.assertTrue(startPage.whoopsModalBodyText().getText().contains("Something looks wrong"));
    }
}

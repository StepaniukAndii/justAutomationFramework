package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBackToHomeScreen extends TestInit {
    Header header;
    @Test
    public void testBackToHomeScreen(){
        header = new Header(driver);
        openUrl("https://eatstreet.com/signin");
        header.logoBtn().click();
        sleep(1);
        Assert.assertEquals("https://eatstreet.com/", driver.getCurrentUrl());
    }
}
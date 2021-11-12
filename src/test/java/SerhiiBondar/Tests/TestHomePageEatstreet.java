package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageEatstreet extends TestInit {

    @Test
    public void testBecomeADriverInSelectedCity(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getPartnerWithUsBtn().click();
        homeEatstreetPage.getApplyNowString().click();
        sleep(2);
        homeEatstreetPage.getApplyInYourCityField().click();
        homeEatstreetPage.getCityAppleton().click();

        Assert.assertEquals(homeEatstreetPage.getDriverAppletonString().getText(),"Delivery Driver - Appleton, WI.");








    }
}

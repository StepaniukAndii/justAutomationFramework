package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.RestaurantEatstreetPage;
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
    @Test
    public void testGetCareers(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getCareersBtn().click();
        sleep(2);

        Assert.assertTrue(homeEatstreetPage.getAllJobsTable().isDisplayed());
    }
    @Test
    public void testAcrossTheNation(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAtlanta().click();
        sleep(2);
        homeEatstreetPage.getBurgers().click();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        sleep(2);

        Assert.assertEquals(restaurantEatstreetPage.burgersInAtlanta().getText(),
                "Burger Delivery & Takeout in Atlanta, GA");
    }
}

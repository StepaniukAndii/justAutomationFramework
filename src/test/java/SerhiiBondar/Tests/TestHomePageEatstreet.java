package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.RestaurantEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAtlanta().click();
        homeEatstreetPage.getBurgers().click();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        sleep(2);

        Assert.assertEquals(restaurantEatstreetPage.burgersInAtlanta().getText(),
                "Burger Delivery & Takeout in Atlanta, GA");
    }
    @Test
    public void testCustomerSupport() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getForCustomersLink().click();
        homeEatstreetPage.getFAQsLink().click();
        homeEatstreetPage.getGiftCardQuestionLink().click();

        Assert.assertEquals(homeEatstreetPage.getGiftCardQuestion().getText(),"Can I buy a gift card?");
        Assert.assertEquals(homeEatstreetPage.getAnswer().getText(),"Answer");
    }
}

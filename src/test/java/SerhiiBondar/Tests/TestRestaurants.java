package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.RestaurantEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRestaurants extends TestInit {
    @Test
    public void testSortOption(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
            if (homeEatstreetPage.addressSearchAttempModalWindow().size()>0){
                homeEatstreetPage.getEnterAddressBtn().click();}
            else{homeEatstreetPage.getFedBtn().click();}
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getSortOptions().click();
        restaurantEatstreetPage.getDeliveryFeeBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getSortByDeliveryFee().getText(),"Sort by: Delivery Fee");

    }
}

package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.RestaurantsPage;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchAddress extends TestInit {
    StartPage startPage;
    RestaurantsPage restaurantsPage;

    @Test
    public void testSearchAdress(){
        startPage = new StartPage(driver);
        restaurantsPage = new RestaurantsPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.searchAddressInput().sendKeys("Ukrainian Village, Chicago, IL, USA");
        startPage.getFedBtn().click();
        startPage.addressSearchAttemptEnter().click();
        startPage.getFedBtn().click();
        Assert.assertTrue(restaurantsPage.restaurantsListHeader().getText().contains("Chicago Restaurants That Deliver & Takeout"));
    }
}

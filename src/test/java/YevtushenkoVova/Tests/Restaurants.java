package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.NYRestaurants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Restaurants extends TestInit {

    @Test
    public void nyRest(){
        NYRestaurants nyRestaurants = new NYRestaurants(driver);
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/new-york-city-ny/cuisines/asian-food-delivery-takeout?espPageNumber=1");
        homePage.buttonGotIt().click();
        nyRestaurants.restSushi21().click();
        sleep(3);
        nyRestaurants.gyoza().get(2).click();
        sleep(3);
        nyRestaurants.xBoxFried().click();
        nyRestaurants.xBoxPorc().click();
        nyRestaurants.btnAddToCart().click();

        Assert.assertTrue(nyRestaurants.btnOrder().isDisplayed());
    }

}

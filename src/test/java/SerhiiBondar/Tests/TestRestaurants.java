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
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getSortOptions().click();
        restaurantEatstreetPage.getDeliveryFeeBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getSortByDeliveryFee().getText(),"Sort by: Delivery Fee");
    }
    @Test
    public void testListOfRestInSelectedCity(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);

        Assert.assertEquals(restaurantEatstreetPage.getRestListHeader().getText(),
                "Chicago Restaurants That Deliver & Takeout");
    }
    @Test
    public void testRestCategories(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getAsianFoodBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getRestListContainer().get(0).getText(),
                "Asian Food");
    }
    @Test
    public void testRestFilters(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getFilterRating4PlusBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getRestListContainer().get(0).getText(),"Rating 4+");
    }
    @Test
    public void testRestRating(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        if (restaurantEatstreetPage.restRatings().isDisplayed()) {
            restaurantEatstreetPage.restRatings().click();
        } else {
            restaurantEatstreetPage.getRestList().get(1).click();
            restaurantEatstreetPage.restRatings().click();
        }

        Assert.assertTrue(restaurantEatstreetPage.reviewQuantity().getText().contains("Review"));
    }
}

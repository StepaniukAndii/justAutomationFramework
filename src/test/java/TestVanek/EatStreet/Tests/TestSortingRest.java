package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.RestaurantsPage;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.annotations.Test;

public class TestSortingRest extends TestInit {
    RestaurantsPage restaurantsPage;
    StartPage startPage;

    public void testSearchAddress(){
        startPage = new StartPage(driver);
        restaurantsPage = new RestaurantsPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.searchAddressInput().sendKeys("Ukrainian Village, Chicago, IL, USA");
        startPage.getFedBtn().click();
        startPage.addressSearchAttemptEnter().click();
        startPage.getFedBtn().click();
    }
    @Test
    public void testSortingRest(){
        restaurantsPage = new RestaurantsPage(driver);
        startPage = new StartPage(driver);
        testSearchAddress();
        restaurantsPage.sortByOptionBtn().click();
        restaurantsPage.sortByOptionContent().get(0).click();
        for(int i = 0; i < 4; i++){
            restaurantsPage.sortByOptionBtn().click();
            restaurantsPage.sortByOptionContent().get(i).click();
        }
    }
}

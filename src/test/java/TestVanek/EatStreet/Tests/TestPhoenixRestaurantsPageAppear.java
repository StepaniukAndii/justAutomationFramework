package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.CityRestaurantsPage;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPhoenixRestaurantsPageAppear extends TestInit {
    StartPage startPage;
    CityRestaurantsPage cityRestaurantsPage;
    @Test
    public void testPhoenixRestaurantsPageAppear(){
        startPage = new StartPage(driver);

        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.phoenixRestaurantsPageBtn().click();
        cityRestaurantsPage = new CityRestaurantsPage(driver) ;
        Assert.assertTrue(cityRestaurantsPage.cityTitle().getText().contains("Phoenix"));
    }
}

package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchRestInCity extends TestInit {

    @Test
    public void searchRestInCity() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.selectCityMuncie().click();
        homePage.selectCategoryLateNightFood().click();
        homePage.selectRestInCity().click();
        homePage.clickSearchMenu().sendKeys("Deluxe Pizza");
        Assert.assertTrue(homePage.checkTextDeluxPizza().getText().contains("Deluxe Pizza"));
        }

}

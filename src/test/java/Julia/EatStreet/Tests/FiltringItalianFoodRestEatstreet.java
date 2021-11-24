package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltringItalianFoodRestEatstreet extends TestInit {

    @Test
    public void filtringItalianFoodRestEatstreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("San Francisco, CA");
        homePage.getFedBtn().click();
        homePage.getItalianFoodLabel().get(57).click();
        sleep(5);
        Assert.assertTrue(homePage.getItalianFood().getText().contains("Italian Food"));
    }

    @Test
    public void filtrTakeOutEatstreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getBaltimoreCity().click();
        sleep(5);
        homePage.getDesertLabel().get(4).click();
        sleep(5);
        Assert.assertTrue(homePage.getAllRest().get(2).isDisplayed());
    }

}

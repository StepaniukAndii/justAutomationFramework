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
        homePage.checkAndClousePopUpWindow();
        sleep(5);
        homePage.getItalianFoodLabel().get(57).click();
        sleep(5);
        Assert.assertTrue(homePage.getItalianFood().getText().contains("Italian Food"));
    }
}

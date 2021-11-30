package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrRestOrlando extends TestInit {

    @Test
    public void filtrRestOrlando() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("Orlando, FL");
        sleep(5);
        homePage.getFedBtn().click();
        //homePage.getAdressSearchAttempt().get(1).click();
        sleep(3);
        homePage.getAllRest().get(homePage.getAllRest().size() - 2).click();
        sleep(3);
        Assert.assertTrue(homePage.getBackToOrlando().isDisplayed());

    }
}

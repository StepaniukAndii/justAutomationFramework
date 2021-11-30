package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnRestTerms extends TestInit {

    @Test
    public void btnRestTerms() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnRestTerms().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("restaurant-terms-of-service"));
    }
}

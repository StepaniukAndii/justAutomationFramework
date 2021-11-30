package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTabCheck extends TestInit {

    @Test
    public void apiTabCheck() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAPI().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("developers"));
    }
}

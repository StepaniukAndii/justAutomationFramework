package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnRestDashboard extends TestInit {

    @Test
    public void btnRestDashboard() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnRestDashboard().click();
        sleep(5);
        homePage.btnCreateFreeAccount().click();
        sleep(5);
        Assert.assertTrue(homePage.getSignUpDashboard().isDisplayed());

    }
}

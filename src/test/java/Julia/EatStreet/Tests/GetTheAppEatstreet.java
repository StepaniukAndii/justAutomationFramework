package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTheAppEatstreet extends TestInit {

    @Test
    public void getTheAppEatstreet(){
    HomePage homePage = new HomePage(driver);
    openUrl("https://qa2.eatstreet.com/");
    homePage.checkAndClousePopUpWindow();
    homePage.googleAppLink().click();
    Assert.assertTrue(homePage.getAppGooglePlay().isDisplayed());
    }

}

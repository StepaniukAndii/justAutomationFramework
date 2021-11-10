package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckApplyInYourCity extends TestInit {

    @Test
    public void checkApplyInYourCity(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnApplyNow().click();
        sleep(2);
        homePage.applyCity().click();
        homePage.fieldApplyInYourCity().click();
        Assert.assertTrue(homePage.getDeliveryDriver().isDisplayed());
    }
}

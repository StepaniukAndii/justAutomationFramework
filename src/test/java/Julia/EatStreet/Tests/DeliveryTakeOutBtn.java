package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeliveryTakeOutBtn extends TestInit {

    @Test
    public void deliveryTakeOutBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.clickDeliveryBtn().click();
        homePage.clickTakeOutBtn().click();
        homePage.getFedBtn().click();
        Assert.assertTrue(homePage.getAdressSearchAttempt().get(0).isDisplayed());
    }

    @Test
    public void TakeOutBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("San Francisco, CA");
        homePage.clickTakeOutBtn().click();
        homePage.getFedBtn().click();

        Assert.assertTrue(homePage.getRadioBtnTakeOut().isDisplayed());
    }
}
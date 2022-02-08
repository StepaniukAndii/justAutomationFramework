package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.NYRestaurants;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NYRest extends TestInit {

    @Test
    public void nyRest() {
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.inputEetSt().sendKeys("New York City, NY" + "\n");

        Assert.assertTrue(homePage.nyRest().isDisplayed());

    }

    @Test
    public void nyRestFilter() {
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.inputEetSt().sendKeys("New York City, NY" + "\n");
        homePage.btnEnterAddress().click();
        sleep(1);
        homePage.btnGetFet().click();
        sleep(3);
        homePage.takeoutFilter().click();

        Assert.assertTrue(homePage.takeCheckBox().isEnabled());
    }

    @Test
    public void nyRestFilterBBQ() {
        HomePage homePage = new HomePage(driver);
        NYRestaurants nyRestaurants = new NYRestaurants(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.inputEetSt().sendKeys("New York City, NY" + "\n");
        homePage.btnEnterAddress().click();
        homePage.btnGetFet().click();
        sleep(3);
        homePage.checkBoxBBQ().get(0).click();

        Assert.assertTrue(nyRestaurants.activeFilterBBQ().isDisplayed());
    }

    @Test
    public void nyRestFilterFreeDelivery() {
        HomePage homePage = new HomePage(driver);
        NYRestaurants nyRestaurants = new NYRestaurants(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.inputEetSt().sendKeys("New York City, NY" + "\n");
        homePage.btnEnterAddress().click();
        homePage.btnGetFet().click();
        sleep(2);
        nyRestaurants.freeDeliveryFilter().click();
        sleep(2);

         Assert.assertTrue(nyRestaurants.activeFreeDeliveryFilter().isDisplayed());

    }


}
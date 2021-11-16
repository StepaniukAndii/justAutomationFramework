package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.*;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOthers extends TestInit {

    @Test
    public void testChooseValentinoCafeInLosAngeles() {
        HomePage homePage = new HomePage(driver);
        CityPage cityPage = new CityPage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.navigateHome();
        homePage.closeModal();
        homePage.getCityLosAngeles().click();
        sleep(1);
        cityPage.getCoffeeTeaInLosAngeles().click();
        sleep(1);

        Assert.assertTrue(restPage.getRestNearYou().isDisplayed());
    }

    @Test
    public void testCheckDownloadAppForAndroidDevices() {
        HomePage homePage = new HomePage(driver);
        GetTheAppPage getTheAppPage = new GetTheAppPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getGetTheAppLink().click();
        sleep(1);
        getTheAppPage.getAndroidRadioBtn().click();
        getTheAppPage.getReceiveSmsNotifications().click();
        getTheAppPage.getMobileNumberField().sendKeys("(302) 689-1524");
        getTheAppPage.getTextAndroidLinkBtn().click();
        sleep(1);

        Assert.assertTrue(getTheAppPage.getPopupSmsSent().isDisplayed());
    }

    @Test
    public void testCheckDownloadAppForIPhoneDevices() {
        HomePage homePage = new HomePage(driver);
        GetTheAppPage getTheAppPage = new GetTheAppPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getGetTheAppLink().click();
        sleep(1);
        getTheAppPage.getIPhoneRadioBtn().click();
        getTheAppPage.getMobileNumberField().sendKeys("(302) 689-4251");
        getTheAppPage.getReceiveSmsNotifications().click();
        getTheAppPage.getTextAndroidLinkBtn().click();
        sleep(1);

        Assert.assertTrue(getTheAppPage.getPopupSmsSent().isDisplayed());
    }

    @Test
    public void testThirdRestaurantFromTheLastPage() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        FoodPage foodPage = new FoodPage(driver);
        homePage.navigateHomeQa2();
        homePage.getAddressField().sendKeys("Los Angeles");
        homePage.closeModal();
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        sleep(1);
        restPage.getLastPageRest();
        restPage.getThirdFromTheEndRest();
        sleep(1);

        Assert.assertTrue(foodPage.getAddAnyFood().isDisplayed());
    }

    @Test
    public void testDeliveryDriverMadisonFieldValidationScript() {
        HomePage homePage = new HomePage(driver);
        DriverPage driverPage = new DriverPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getApplyNowLink().click();
        sleep(1);
        driverPage.getApplyInYourCityBtn().click();
        driverPage.getMadisonInCity().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/careers/delivery-driver-madison"));
    }

    @Test
    public void testCheckLinkLasVegasInSection() {
        HomePage homePage = new HomePage(driver);
        FoodPage foodPage = new FoodPage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getVegasCityLink().click();
        sleep(1);
        foodPage.getJapaneseFoodVegasBtn().click();
        sleep(1);

        Assert.assertTrue(restPage.getJapaneseMsg().isDisplayed());
    }

    @Test
    public void testTakeoutOfItalianFoodInTheCityOfNewark() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.navigateHomeQa2();
        homePage.getAddressField().sendKeys("Newark");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        sleep(1);
        restPage.getTakeoutRadioBtn().click();
        homePage.closeModal();
        restPage.getItalianFoodLabel().click();

        Assert.assertTrue(restPage.getSpanItalianFood().isDisplayed());
        Assert.assertTrue(restPage.getDeliveryMsg().isDisplayed());
    }

    @Test
    public void testTakeoutOfIndianFoodInTheCityOfAlbany() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.navigateHomeQa2();
        homePage.getTakeoutBtn().click();
        homePage.getAddressField().sendKeys("Albany");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();
        homePage.closeModal();
        sleep(1);
        restPage.getIndianFoodLabel().click();

        Assert.assertTrue(restPage.getSpanIndianFood().isDisplayed());
        Assert.assertTrue(restPage.getDeliveryMsg().isDisplayed());
    }
}
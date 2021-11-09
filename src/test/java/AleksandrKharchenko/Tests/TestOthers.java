package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.CityPage;
import AleksandrKharchenko.Pages.GetTheAppPage;
import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.RestPage;
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
    public void testCheckDownloadAppForAndroidDevices(){
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
    public void testCheckDownloadAppForIPhoneDevices(){
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
}
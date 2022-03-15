package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.AccountPage;
import AleksandrKharchenko.Pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOlx extends TestInit {

    @Test
    public void checkChoiceOfApartmentSectionInLutsk(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeModalOlx().click();
        homePage.getFieldAllUkraine().click();
        homePage.getVolynskayaObl().click();
        homePage.getCityLutsk().click();
        homePage.getNedvigimostSection().click();
        sleep(1);
        homePage.getLinkFlat().click();

        Assert.assertTrue(homePage.isDisplayedFlatInLuck());
    }

    @Test
    public void checkDoIt(){
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeModalOlx().click();
        homePage.getLinkMyProfile().click();
        accountPage.getFacebookLoginBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com/login"));
    }
}

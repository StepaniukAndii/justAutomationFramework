package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.CityPage;
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
}
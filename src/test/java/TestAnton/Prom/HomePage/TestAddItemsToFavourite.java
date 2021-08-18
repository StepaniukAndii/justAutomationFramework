package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddItemsToFavourite extends TestInit {

    @Test
    public void testAddItemsToFavourite(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.signInBtn().click();
        homePage.signInInputField().click();
        homePage.signInInputField().sendKeys("anton.4uvirov@gmail.com");
        homePage.confirmSignInBtn().click();
        homePage.getSignInEnterPasswordField().click();
        homePage.getSignInEnterPasswordField().sendKeys("123456789");
        homePage.confirmSignInBtn().click();
        homePage.getSearchHomePage().sendKeys("неокуб\n");
        homePage.getAddToFavourite().get(0).click();
        homePage.getFavouriteCabinetBtn().click();
        Assert.assertTrue(homePage.getBuyBtnInFavourite().isDisplayed());
        homePage.getDeleteItemFromFavourite().click();
        Assert.assertTrue(homePage.getShoppingBtnInFavourite().isDisplayed());
    }
}

package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddItemsToCart extends TestInit {

    @Test
    public void testAddItemsToCart(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getSearchHomePage().sendKeys("неокуб\n");
        homePage.getBuyButtons().get(1).click();
        homePage.getCloseCartBtn().click();
        homePage.getOpenCartBtn().click();
        homePage.getDeleteFromCartBtn().click();
        Assert.assertEquals(homePage.getCartIsEmptyText().getText(), "В кошику немає товарів");
    }
}

package TestVanek.Rozetka.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.Rozetka.Pages.BasketPage;
import TestVanek.Rozetka.Pages.GoodsPage;
import TestVanek.Rozetka.Pages.ProductPage;
import TestVanek.Rozetka.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToBasket extends TestInit {
    StartPage startPage;
    GoodsPage goodsPage;
    ProductPage productPage;
    BasketPage basketPage;
    @Test
    public void testAddToBasket(){
        startPage = new StartPage(driver);
        goodsPage = new GoodsPage(driver);
        productPage = new ProductPage(driver);
        basketPage = new BasketPage(driver);
        openUrl("https://rozetka.com.ua/");
        startPage.searchInput().sendKeys("Whisky");
        startPage.searchBtn().click();
        goodsPage.goods().get(0).click();
        goodsPage.ageAssertBtn().click();
        productPage.buyBtn().click();
        productPage.continueBuy().click();
        productPage.basketBtn().click();
        Assert.assertEquals(productPage.productTitle().getText(), basketPage.productTitle().getText());
    }
}

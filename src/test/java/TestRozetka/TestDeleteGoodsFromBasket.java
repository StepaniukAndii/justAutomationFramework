package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeleteGoodsFromBasket extends TestInit {

    @Test
    public void testDeleteGoodsFromBasket() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().click();
        homePage.searchField().sendKeys("phone\n");
        homePage.getElementsGoods().get(0).click();
        String pricesString =homePage.getProductPrices().getText();
        pricesString = pricesString.replace(" ", "");
        String[] strings = pricesString.split("₴");
        int price = Integer.parseInt(strings[0]);
        homePage.addCart().click();
        for (int i = 0; i < 3; i++) {
            homePage.getButtonAddOneMoreProduct().click();
        }
        if (price*3!=34999*3) {
            Assert.fail("Fail!");
        }
    }
}

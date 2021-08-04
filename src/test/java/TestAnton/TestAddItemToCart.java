package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddItemToCart extends TestInit {

    @Test
    public void testAddItemToCart() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.searchField().click();
        homePage.searchFieldLong().sendKeys("Кольцо\n");
        homePage.itemsRings().get(1).click();
        String nameOfTheChosenProduct = homePage.nameOfTheChosenProduct().getText();
        homePage.addToCartBtn().click();
        homePage.closeCartAddedModal().click();
        homePage.cartBtn().click();
        String nameOfTheChosenProductInCart = homePage.nameOfTheChosenProductInCart().getText();
        Assert.assertEquals(nameOfTheChosenProduct, nameOfTheChosenProductInCart);
    }
}

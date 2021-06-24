package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.HeaderPage;
import testRozetkaDenis.pages.ProductPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestCart extends TestInit {

    @Test
    public void cart() {
        HeaderPage hp = new HeaderPage(driver);
        ProductPage pp = new ProductPage(driver);
        openUrl("https://rozetka.com.ua/");
        hp.searchRozetka().sendKeys("Xiaomi redmi\n");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (pp.removeAd().isDisplayed()) {
            pp.removeAd().click();
        } else {

        }
        //add goods inside cart. Check amount of them
        addInsideCartFast();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        hp.cartWithGoods().click();
        int amountOfGoodsInCart = pp.amountOfGoodsInsideCart().size();
        Assert.assertEquals(amountOfGoodsInCart, 3);
        //remove goods from cart. Check amount of them
        for (int i = 0; i < amountOfGoodsInCart; i++) {
            sleep(2); //for proper cart elements update
            pp.amountOfGoodsInsideCart().get(0).click();
            pp.deleteElementIsnideCart().click();
        }
        amountOfGoodsInCart = 0;
        Assert.assertEquals(amountOfGoodsInCart, 0);
        pp.modalWindowClose().click();
        //add several goods inside cart, remove one, and then add more elements. Check amount of them
        addInsideCartFast();
        hp.cartWithGoods().click();
        sleep(1); //for proper loading of modal window
        pp.amountOfGoodsInsideCart().get(0).click();
        pp.deleteElementIsnideCart().click();
        pp.modalWindowClose().click();
        pp.nextPage().click();
        addInsideCartFast();
        hp.cartWithGoods().click();
        amountOfGoodsInCart = pp.amountOfGoodsInsideCart().size();
        Assert.assertEquals(amountOfGoodsInCart, 5);
    }

    private void addInsideCartFast() {
        ProductPage pp = new ProductPage(driver);
        for (int i = 0; i < 3; i++) {
            pp.addToCart().get(i).click();
        }
    }
}

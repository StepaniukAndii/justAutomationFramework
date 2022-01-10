package denisFoxtrotTest.mainTest.cartTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HeaderFoxtrot;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

import java.util.Random;

public class AddInsideCart extends TestInit {

    @Test
    public void addInsideCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        HeaderFoxtrot headerFoxtrot = new HeaderFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Смартфони\n");
        Random rand = new Random();
        int upperbound = 4;
        int p = rand.nextInt(upperbound);
        for (int m = 0; m < 3; m++) {
            homePageFoxtrot.findMerch().get(p).click();
            homePageFoxtrot.addToCart().click();
            driver.navigate().back();
            p++;
        }
        homePageFoxtrot.checkCart().click();
        homePageFoxtrot.displayCart().click();
        headerFoxtrot.headerLangUA().click();
        for (int i = 0; i < 68; i++) {
            homePageFoxtrot.increaseQuantity().get(0).click();
        }
    }
}

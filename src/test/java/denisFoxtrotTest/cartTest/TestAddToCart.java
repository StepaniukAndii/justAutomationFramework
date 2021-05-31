package denisFoxtrotTest.cartTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.foxPages.HomePageFoxtrot;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Random;

public class TestAddToCart extends TestInit {

    @Test
    public void addToCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильник\n");
        Random rand = new Random();
        int upperbound = 4;
        int merchAdd = rand.nextInt(upperbound);
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                homePageFoxtrot.findMerch().get(merchAdd).click();
                homePageFoxtrot.addToCart().click();
                driver.navigate().back();
                merchAdd++;
            }
            homePageFoxtrot.nextPage().click();
            sleep(1);
        }
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                homePageFoxtrot.addToCartList().get(merchAdd).click();
                merchAdd++;
            }
            homePageFoxtrot.nextPage().click();
            sleep(1);
        }
    }
}

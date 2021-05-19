package denisFoxtrotTest.mainTest.cartTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

import java.util.Random;

public class AddCartTest extends TestInit {

    @Test
    public void AddFridgeToCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильники\n");
        Random rand = new Random();
        int upperbound = 4;
        int p = rand.nextInt(upperbound);
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 5; m++) {
                homePageFoxtrot.findMerch().get(p).click();
                sleep(1);
                homePageFoxtrot.addToCart().click();
                driver.navigate().back();
                p++;
                sleep(2);
            }
            homePageFoxtrot.nextPage().click();
            sleep(2);
        }
    }
}

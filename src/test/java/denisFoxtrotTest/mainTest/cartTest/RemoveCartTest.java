package denisFoxtrotTest.mainTest.cartTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class RemoveCartTest extends TestInit {

    @Test
    public void RemoveCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильники\n");
        int p = 1;
        for (int i = 0; i < 3; i++) {
            homePageFoxtrot.findMerch().get(p).click();
            homePageFoxtrot.addToCart().click();
            driver.navigate().back();
            p++;
        }
        homePageFoxtrot.checkCart().click();
        homePageFoxtrot.displayCart().click();
        int t = homePageFoxtrot.deleteFromCart().size();
        int size = 0;
        for (int i = 0; i < t; i++) {
            homePageFoxtrot.deleteFromCart().get(size).click();
        }
    }
}

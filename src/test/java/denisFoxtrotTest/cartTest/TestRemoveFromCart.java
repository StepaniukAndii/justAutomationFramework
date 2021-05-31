package denisFoxtrotTest.cartTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.foxPages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class TestRemoveFromCart extends TestInit {

    @Test
    public void removeFromCart() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильник\n");
        homePageFoxtrot.addToCartList().get(3).click();
        while (!homePageFoxtrot.cartTooltip().isEnabled()) {
            homePageFoxtrot.headerCart().click();
        }
        homePageFoxtrot.openCart().click();
        int size = homePageFoxtrot.removeInsideCart().size();
        int remove = 0;
        for (int i = 0; i < size; i++) {
            homePageFoxtrot.removeInsideCart().get(remove).click();
        }
        driver.navigate().back();
        homePageFoxtrot.addToCartList().get(2).click();
        while (!homePageFoxtrot.cartTooltip().isEnabled()) {
            homePageFoxtrot.headerCart().click();
        }
        int merchAmount = homePageFoxtrot.removeFromCartTooltip().size();
        for (int i = 0; i < merchAmount; i++) {
            homePageFoxtrot.removeFromCartTooltip().get(remove).click();
            sleep(1);
        }
    }
}

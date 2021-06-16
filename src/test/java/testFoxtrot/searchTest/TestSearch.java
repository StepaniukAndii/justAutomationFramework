package testFoxtrot.searchTest;

import ClasesToAllUs.TestInit;
import testFoxtrot.foxPages.HomePageFoxtrot;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {

    @Test
    public void testSearch() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильник\n");
        checkURLPositive();
        homePageFoxtrot.getSearch().sendKeys("ХоЛоДильНик\n");
        checkURLPositive();
        homePageFoxtrot.getSearch().sendKeys("Холодильник%\n");
        checkURLNegative();
        homePageFoxtrot.getSearch().sendKeys("Холдильник\n");
        checkURLNegative();

    }
    public void checkURLPositive() {
        String urlText = driver.getCurrentUrl();
        if (urlText.contains("https://www.foxtrot.com.ua/ru/shop/holodilniki.html")) {
            System.out.println("All good.");
        } else {
            Assert.fail();
        }
    }
    public void checkURLNegative() {
        String urlText = driver.getCurrentUrl();
        if (!urlText.contains("https://www.foxtrot.com.ua/ru/shop/holodilniki.html")) {
            System.out.println("Invalid URL");
        } else {
            Assert.fail();
        }
    }
}

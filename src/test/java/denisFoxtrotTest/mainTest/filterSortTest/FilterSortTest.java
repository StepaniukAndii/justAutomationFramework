package denisFoxtrotTest.mainTest.filterSortTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import denisFoxtrotTest.pages.ProductPage;
import org.testng.annotations.Test;

import java.nio.file.OpenOption;
import java.util.Random;

public class FilterSortTest extends TestInit {

    @Test
    public void filterSortTest() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Смартфони\n");
        productPage.sortPriceDesc().click();
        productPage.sortPriceAsc().click();
        productPage.sortBYPopularity().click();
        Random rand = new Random();
        int upperbound = 8;
        int p = rand.nextInt(upperbound);
        for (int i = 0; i < 5; i++) {
            productPage.filters().get(p).click();
            p++;
        }
    }
}

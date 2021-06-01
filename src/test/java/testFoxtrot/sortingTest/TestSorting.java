package testFoxtrot.sortingTest;

import ClasesToAllUs.TestInit;
import testFoxtrot.foxPages.FilterPage;
import testFoxtrot.foxPages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class TestSorting extends TestInit {

    @Test
    public void sorting() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        FilterPage filterPage = new FilterPage(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Смартфони\n");
        filterPage.sortDesc().click();
        filterPage.sortAsc().click();
        filterPage.sortPopularity().click();
        int size = 0;
        for (int i = 0; i < 13; i++) {
            filterPage.filters().get(size).click();
            size++;
        }
    }
}

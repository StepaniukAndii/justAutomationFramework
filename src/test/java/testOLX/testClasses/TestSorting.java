package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;
import testOLX.pages.ProductPage;

public class TestSorting extends TestInit {

    @Test
    public void sorting() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeCookies().click();
        int size = 0;
        homePage.searchHeader().sendKeys("Телефоны\n");
        productPage.openSorting().click();
        productPage.cheapestSort().click();
        productPage.openSorting().click();
        productPage.expensiveSort().click();
        productPage.sortingWide().click();
        productPage.sortingList().click();
        for (int i = 0; i < 2; i++) {
                productPage.currency().get(size).click();
                size++;
        }
    }
}

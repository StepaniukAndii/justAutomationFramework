package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;
import testOLX.pages.ProductPage;

public class TestFilters extends TestInit {

    @Test
    public void filters() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeCookies().click();
        homePage.searchHeader().sendKeys("Товар\n");
        for (int i = 0; i < 2; i++) {
            productPage.searchInProduct().click();
            productPage.searchWithPhotos().click();
            productPage.withDelivery().click();
        }
        productPage.heading().click();
        productPage.filters().get(0).click();
        productPage.filterBlocks().get(0).click();
        int size = productPage.productStatus().size();
        for (int i = 0; i < size; i++) {
            productPage.productStatus().get(i).click();
        }
    }
}

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
        homePage.searchHeader().sendKeys("Телефоны\n");
        productPage.searchInProduct().click();
        productPage.searchWithPhotos().click();
        productPage.withDelivery().click();
    }
}

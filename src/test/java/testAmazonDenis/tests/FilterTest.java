package testAmazonDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testAmazonDenis.pages.HeaderPage;
import testAmazonDenis.pages.ProductPage;

public class FilterTest extends TestInit {
    ProductPage productPage;
    HeaderPage headerPage;

    @Test
    public void filterTest() {
        productPage = new ProductPage(driver);
        headerPage = new HeaderPage(driver);
        openUrl("https://www.amazon.com/");
        headerPage.amazonSearchField().sendKeys("Microwave ovens");
        headerPage.amazonConfirmSearchBtn().click();
        for (int i = 1; i < 4; i++) {
            productPage.filterCheckboxes().get(i).click();
        }
        for (int i = 0; i < productPage.filterByCustomerReview().size(); i++) {
            productPage.filterByCustomerReview().get(i).click();
        }
    }
}

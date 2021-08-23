package testAmazonDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAmazonDenis.pages.CartPage;

public class CartTest extends TestInit {

    CartPage cartPage;

    @Test
    public void cartTest() {
        cartPage = new CartPage(driver);
        openUrl("https://www.amazon.com/");
        cartPage.headerPage().amazonSearchField().sendKeys("Microwave");
        cartPage.headerPage().amazonConfirmSearchBtn().click();
        cartPage.productPage().amazonSelectProduct().get(0).click();
        cartPage.productPage().addToCartBtn().click();
        sleep(1);
        cartPage.productPage().switchToCart().click();

        Assert.assertEquals(cartPage.deleteProductBtn().size(), 1);
    }
}

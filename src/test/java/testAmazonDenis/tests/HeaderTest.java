package testAmazonDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAmazonDenis.pages.HeaderPage;

public class HeaderTest extends TestInit {

    HeaderPage headerPage;

    @Test
    public void headerTest() {
        headerPage = new HeaderPage(driver);
        openUrl("https://www.amazon.com/");

        Assert.assertTrue(headerPage.amazonLogo().isDisplayed());
        Assert.assertTrue(headerPage.searchInSection().isDisplayed());
        Assert.assertTrue(headerPage.amazonSearchField().isDisplayed());
        Assert.assertTrue(headerPage.amazonConfirmSearchBtn().isDisplayed());
        Assert.assertTrue(headerPage.changeLanguageAndCurrency().isDisplayed());
        Assert.assertTrue(headerPage.accountAndLists().isDisplayed());
        Assert.assertTrue(headerPage.returnsAndOrders().isDisplayed());
        Assert.assertTrue(headerPage.amazonCart().isDisplayed());
    }
}

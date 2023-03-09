package testEatStreetDenis.tests.header;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.header.HeaderPage;

public class HeaderTest extends TestInit {

    HeaderPage getHeaderPage;

    @Test
    public void checkHeaderElements() {
        getHeaderPage = new HeaderPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        getHeaderPage.getLogo().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.eatstreet.com/");

        getHeaderPage.transferToPartnerWithUsSection().click();
        getHeaderPage.openSignIn().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.eatstreet.com/signin");

        getHeaderPage.openCart().click();
        if (getHeaderPage.cartSection().isDisplayed())
            System.out.println("Cart is displayed");
        else {
            Assert.fail("Cart is not displayed");
        }
    }
}
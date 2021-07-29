package testEatStreetDenis.tests.header;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.HeaderPage;

public class HeaderTest extends TestInit {

    HeaderPage headerPage;

    @Test
    public void header() {
        headerPage = new HeaderPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        headerPage.logo().click();
        headerPage.partnerWithUs().click();
        headerPage.signIn().click();
        headerPage.cart().click();
    }
}
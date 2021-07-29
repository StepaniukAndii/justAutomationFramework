package testEatStreetDenis.tests.header;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.header.HeaderPage;

public class HeaderTest extends TestInit {

    HeaderPage homePage;

    @Test
    public void header() {
        homePage = new HeaderPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.logo().click();
        homePage.partnerWithUs().click();
        homePage.signIn().click();
        homePage.cart().click();
    }
}
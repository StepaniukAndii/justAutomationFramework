package testEatStreetDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.HomePage;

public class HeaderTest extends TestInit {

    HomePage homePage;

    @Test
    public void header() {
        homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.logo().click();
        homePage.partnerWithUs().click();
        homePage.signIn().click();
        homePage.cart().click();
    }
}
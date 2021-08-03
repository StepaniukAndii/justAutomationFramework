package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import junit.framework.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class SearchAreaTest extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void searchEatStreet() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.getFedBtn().click();
        landingContentPage.enterAddressModalWindowButton().click();
        landingContentPage.searchFieldEatStreet().sendKeys("Phoenix, US\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFedBtn().click();

        Assert.assertEquals("Phoenix Restaurants That Deliver & Takeout",
                landingContentPage.restaurantsPage().restaurantsLabel().getText());

        driver.navigate().back();
        landingContentPage.getFedBtn().click();
        landingContentPage.locateMeModalWindowButton().click();
        landingContentPage.closeModalWindow().click();
        driver.navigate().back();
        sleep(1); //for elements load
        landingContentPage.useMyLocation().click();
        landingContentPage.closeModalWindow().click();
        driver.navigate().back();
    }
}

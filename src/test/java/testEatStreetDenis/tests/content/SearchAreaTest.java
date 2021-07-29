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
        landingContentPage.takeoutCheckbox().click();
        landingContentPage.deliveryCheckbox().click();
        landingContentPage.getFed().click();
        landingContentPage.enterAddressModalWindowButton().click();
        landingContentPage.getFed().click();
        landingContentPage.locateMeModalWindowButton().click();
        landingContentPage.closeModalWindow().click();
        driver.navigate().back();
        sleep(1); //for elements load
        landingContentPage.useMyLocation().click();
        landingContentPage.closeModalWindow().click();
        driver.navigate().back();
        landingContentPage.searchEatStreet().sendKeys("Phoenix, US");
        sleep(1); //if you input this without sleep it'll show you an error that it can't find your location
        // Perhaps the reason is because it send request too fast for system
        landingContentPage.getFed().click();
        Assert.assertEquals("Phoenix Restaurants That Deliver & Takeout",
                landingContentPage.restaurantsPage().restaurantsLabel().getText());
    }
}

package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class NonRegisteredUserReactionTest extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void nonRegisteredUserReaction() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.searchEatStreet().sendKeys("Los Angeles\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFed().click();
        landingContentPage.restaurantsPage().restaurantName().get(0).click();
        landingContentPage.restaurantOrderSelectPage().ordersSelectByPrice().get(0).click();
        for (int i = 0; i < 6; i++) {
            landingContentPage.restaurantOrderSelectPage().increaseQuantity().click();
        }
        landingContentPage.restaurantOrderSelectPage().addToCartBtn().click();
        landingContentPage.restaurantOrderSelectPage().orderBtnClick().click();

        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().signInPage().isDisplayed());
    }
}

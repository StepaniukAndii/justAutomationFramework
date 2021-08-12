package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class OrdersAddedToCartTest extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void addingToCartTest() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.searchEatStreet().sendKeys("Los Angeles\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFed().click();
        landingContentPage.restaurantsPage().restaurantName().get(0).click();
        String yourOrderName = landingContentPage.restaurantOrderSelectPage().ordersSelectByName().get(0).getText();
        landingContentPage.restaurantOrderSelectPage().ordersSelectByName().get(0).click();
        for (int i = 0; i < 6; i++) {
            landingContentPage.restaurantOrderSelectPage().increaseQuantity().click();
        }
        int chosenQuantity = Integer.parseInt(landingContentPage.restaurantOrderSelectPage().
                getQuantityNumber().getText());
        landingContentPage.restaurantOrderSelectPage().addToCartBtn().click();

        Assert.assertEquals(yourOrderName, landingContentPage.restaurantOrderSelectPage().orderNameInCart().getText());

        Assert.assertEquals(chosenQuantity, landingContentPage.restaurantOrderSelectPage().removeOrderBtn().size());
    }
}
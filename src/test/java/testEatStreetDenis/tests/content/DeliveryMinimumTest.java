package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class DeliveryMinimumTest extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void deliveryMinimumCheck() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.searchEatStreet().sendKeys("Los Angeles\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFed().click();
        landingContentPage.restaurantsPage().restaurantName().get(0).click();
        //check if delivery minimum works properly (negative result)
        landingContentPage.restaurantOrderSelectPage().ordersSelectByPrice().get(0).click();
        landingContentPage.restaurantOrderSelectPage().addToCartBtn().click();
        compareDeliveryMinimumAndPrice("is minimum bigger");
        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().orderBtnIsClosed().isDisplayed());
        //check positive result
        landingContentPage.restaurantOrderSelectPage().ordersSelectByPrice().get(0).click();
        for (int i = 0; i < 7; i++) {
            landingContentPage.restaurantOrderSelectPage().increaseQuantity().click();
        }
        landingContentPage.restaurantOrderSelectPage().addToCartBtn().click();
        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().orderBtnAvailable().isDisplayed());
        compareDeliveryMinimumAndPrice("is price bigger");

    }

    private void compareDeliveryMinimumAndPrice(String compareBy) {
        float deliveryMinimum = Float.parseFloat(landingContentPage.restaurantOrderSelectPage().checkDeliveryMinimum()
                .getText().replaceAll("\\D", ""));
        float comparingPrice = Float.parseFloat(landingContentPage.restaurantOrderSelectPage().totalPrice()
                .getText().replaceAll("\\D", ""));
        if(compareBy.equals("is minimum bigger")) {
            Assert.assertTrue(deliveryMinimum > comparingPrice);
        } else  if(compareBy.equals("is price bigger")) {
            Assert.assertTrue(deliveryMinimum < comparingPrice);
        }
    }
}

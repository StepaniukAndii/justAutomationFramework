package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import junit.framework.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;
import testEatStreetDenis.pages.header.AuthPage;

public class RegisteredUserReactionTest extends TestInit {

    LandingContentPage landingContentPage;
    AuthPage authPage;

    @Test
    public void registeredUserReaction() {
        landingContentPage = new LandingContentPage(driver);
        authPage = new AuthPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        authPage.headerPage().signIn().click();
        authPage.signUp().click();
        signUp("testingaccount@gmail.com", "@lpha1082.br!vo");
        landingContentPage.searchEatStreet().sendKeys("Los Angeles\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFed().click();
        landingContentPage.restaurantsPage().restaurantName().get(0).click();
        landingContentPage.restaurantOrderSelectPage().ordersSelectByPrice().get(0).click();
        for (int i = 0; i < 6; i++) {
            landingContentPage.restaurantOrderSelectPage().increaseQuantity().click();
        }
        landingContentPage.restaurantOrderSelectPage().addToCartBtn().click();
        landingContentPage.restaurantOrderSelectPage().orderBtnAvailable().click();

        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().cardInfo().isDisplayed());
    }

    private void signUp(String email, String pass) {
        authPage.email().sendKeys(email);
        authPage.pass().sendKeys(pass);
        authPage.passConfirm().sendKeys(pass);
        authPage.authConfirm().click();
    }
}

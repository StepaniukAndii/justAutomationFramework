package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;
import testEatStreetDenis.pages.header.AuthPage;

public class GroupOrderTest extends TestInit {


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
        landingContentPage.restaurantOrderSelectPage().groupOrderBtn().click();

        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().groupOrderPopUpBody().isDisplayed());

        landingContentPage.restaurantOrderSelectPage().groupOrderNameInput().sendKeys(" Test #1");
        for (int i = landingContentPage.restaurantOrderSelectPage().deliveryTakeoutChoose().size()-1; i >= 0; i--) {
            landingContentPage.restaurantOrderSelectPage().deliveryTakeoutChoose().get(i).click();
        }
        landingContentPage.restaurantOrderSelectPage().streetAddressInput().
                sendKeys("5333 Zoo Dr, Los Angeles, CA 90027, США");
        landingContentPage.restaurantOrderSelectPage().refuseSplitTheBillBtn().click();
        landingContentPage.restaurantOrderSelectPage().splitTheBillBtn().click();
        landingContentPage.restaurantOrderSelectPage().confirmModalBtn().click();
        sleep(1); //for proper modal window loading
        landingContentPage.restaurantOrderSelectPage().cancelModalBtn().click();
        landingContentPage.restaurantOrderSelectPage().groupOrderSettingsBtn().click();

        Assert.assertTrue(landingContentPage.restaurantOrderSelectPage().yourGroupOrderModalBody().isDisplayed());
    }

    private void signUp(String email, String pass) {
        authPage.email().sendKeys(email);
        authPage.pass().sendKeys(pass);
        authPage.passConfirm().sendKeys(pass);
        authPage.authConfirm().click();
    }
}
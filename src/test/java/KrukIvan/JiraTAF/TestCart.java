package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends TestInit {
    @Test
    public void testCart(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n" );
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        sleep(3);
        homePage.getRestaurant().get(2).click();
        homePage.getFoodInRestaurant().get(1).click();
        sleep(1);
        if (homePage.clickAdditionalInformationABTSize().size() > 0){
            homePage.clickAdditionalInformationABTSize().get(0).click();
        }
        sleep(1);
        if (homePage.clickAdditionalInformation().size() > 0){
        homePage.clickAdditionalInformation().get(2).click();}
        homePage.addToCart().click();
        sleep(3);
        homePage.getFoodInRestaurant().get(3).click();
        if (homePage.clickAdditionalInformation().size() > 0){
        homePage.clickAdditionalInformation().get(0).click();}
        sleep(1);
        homePage.addToCart().click();
        sleep(2);
        homePage.bTNCheckout().click();
        homePage.getFoodInRestaurant().get(5).click();
        if (homePage.clickAdditionalInformation().size() > 0){
        homePage.clickAdditionalInformation().get(0).click();}
        Assert.assertTrue(homePage.clickBTNSignInWithFacebook().isDisplayed());
    }
}

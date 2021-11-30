package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBTNAsianFoodInDetroit extends TestInit {
    @Test
    public void testBTNAsianFoodInDetroit(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.clickOnMainPageOnDetroitCity().click();
        homePage.typesOfCuisine().get(1).click();
        Assert.assertTrue(homePage.getInformationABTAsianFood().isDisplayed());
    }
}

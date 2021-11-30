package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckReviews extends TestInit {
    @Test
    public void testReviews(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(3).click();
        homePage.getRestaurant().get(0).click();
        homePage.getReviews().click();
        Assert.assertTrue(homePage.assertReviews().isEnabled());
    }
}

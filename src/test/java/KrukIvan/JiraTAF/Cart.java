package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cart extends TestInit {
    @Test
    public void testCart(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.cart().click();
        Assert.assertTrue(homePage.assertCart().isDisplayed());

    }
}

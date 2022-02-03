package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Footer extends TestInit {
    @Test
    public void elementsFooterEatStreet(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();

        Assert.assertTrue(homePage.aboutUs().isDisplayed());
        Assert.assertTrue(homePage.contactUs().isEnabled());
        Assert.assertTrue(homePage.careers().isDisplayed());
        Assert.assertTrue(homePage.blog().isDisplayed());
    }
}

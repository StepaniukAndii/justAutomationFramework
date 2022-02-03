package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Legal extends TestInit {
    @Test
    public void PrivacyPolicy(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.linkPrivacyPolicy().click();

        Assert.assertTrue(homePage.privacyText().isDisplayed());
    }
    @Test
    public void TermsofUse(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.linkTermsofUse().click();

        Assert.assertTrue(homePage.termsText().isDisplayed());
    }
    @Test
    public void restaurantTerms(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.linkRestaurantTerms().click();

        Assert.assertTrue(homePage.merchantTerms().isDisplayed());
    }
}

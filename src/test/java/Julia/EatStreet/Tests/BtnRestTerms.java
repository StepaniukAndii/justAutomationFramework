package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import Julia.EatStreet.Pages.StripePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnRestTerms extends TestInit {

    @Test
    public void btnRestTerms() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnRestTerms().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("restaurant-terms-of-service"));
    }

    @Test
    public void stripeServiceAgreement() {
        HomePage homePage = new HomePage(driver);
        StripePage stripePage = new StripePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnRestTerms().click();
        homePage.linkStripeServiceAgreement().click();
        sleep(5);
        stripePage.linkStripeServiseAgreement().click();
        sleep(3);
        stripePage.btnSupport().get(1).click();
        sleep(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("support"));
    }

    @Test
    public void stripeServiceAgreementDoc() {
        HomePage homePage = new HomePage(driver);
        StripePage stripePage = new StripePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnRestTerms().click();
        homePage.linkStripeServiceAgreement().click();
        sleep(5);
        stripePage.linkStripeServiseAgreement().click();
        sleep(3);
        stripePage.btnSupport().get(0).click();
        sleep(5);
        stripePage.btnGetStarted().get(1).click();
        Assert.assertTrue(stripePage.stringPayment().isDisplayed());
    }
}

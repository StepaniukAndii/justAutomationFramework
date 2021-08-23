package testAmazonDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAmazonDenis.pages.AuthPage;

public class AuthTest extends TestInit {

    AuthPage authPage;

    @Test
    public void authTest() {
        authPage = new AuthPage(driver);
        openUrl("https://www.amazon.com/");
        authPage.amazonLogIn().click();

        Assert.assertTrue(authPage.signInLogo().isDisplayed());
        Assert.assertTrue(authPage.authEmail().isDisplayed());
        Assert.assertTrue(authPage.authConfirmBtn().isDisplayed());
        Assert.assertTrue(authPage.supportLink().isDisplayed());

        authPage.createAccountBtn().click();

        Assert.assertTrue(authPage.authName().isDisplayed());
        Assert.assertTrue(authPage.authEmail().isDisplayed());
        Assert.assertTrue(authPage.authPassword().isDisplayed());
        Assert.assertTrue(authPage.authConfirmPassword().isDisplayed());
        Assert.assertTrue(authPage.createBusinessAccount().isDisplayed());
        Assert.assertTrue(authPage.switchToSignIn().isDisplayed());

        for (int i = 0; i < authPage.termsAndPolicyAmazon().size(); i++) {
            Assert.assertTrue(authPage.termsAndPolicyAmazon().get(i).isDisplayed());
        }
        Assert.assertTrue(authPage.authConfirmBtn().isDisplayed());
    }
}

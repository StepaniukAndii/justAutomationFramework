package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderOnHomePage extends TestInit {

    @Test
    public void testHeaderOnHomePage() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        Assert.assertTrue(homePage.getSpecialForYouBtn().isDisplayed(),
                "Element getSpecialForYouBtn is not displayed");
        Assert.assertTrue(homePage.getHelpBtnOnHomePage().isDisplayed(),
                "Element getHelpBtnOnHomePage is not displayed");
        Assert.assertTrue(homePage.getMobileAppBtn().isDisplayed(),
                "Element getMobileAppBtn is not displayed");
        Assert.assertTrue(homePage.getCreateCompanyBtn().isDisplayed(),
                "Element getCreateCompanyBtn is not displayed");
        Assert.assertTrue(homePage.signInBtn().isDisplayed(),
                "Element signInBtn is not displayed");
        Assert.assertTrue(homePage.signUpBtn().isDisplayed(),
                "Element signUpBtn is not displayed");
        Assert.assertTrue(homePage.backOnHomePageLogoBtn().isDisplayed(),
                "Element backOnHomePageLogoBtn is not displayed");
        Assert.assertTrue(homePage.getSearchHomePage().isDisplayed(),
                "Element getSearchHomePage is not displayed");
        Assert.assertTrue(homePage.getVoiceSearch().isDisplayed(),
                "Element getVoiceSearch is not displayed");
        Assert.assertTrue(homePage.getChangeRegions().isDisplayed(),
                "Element getChangeRegions is not displayed");
        Assert.assertTrue(homePage.getFavouriteBtnOnHomePage().isDisplayed(),
                "Element getFavouriteBtnOnHomePage is not displayed");
        Assert.assertTrue(homePage.getMessageBtnOnHomePage().isDisplayed(),
                "Element getMessageBtnOnHomePage is not displayed");
        Assert.assertTrue(homePage.getCartBtnOnHomePage().isDisplayed(),
                "Element getCartBtnOnHomePage is not displayed");
    }
}

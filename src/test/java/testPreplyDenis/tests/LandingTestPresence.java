package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPreplyDenis.pages.LandingPage;

public class LandingTestPresence extends TestInit {

    LandingPage landingPage;

    @Test
    public void landingTestPresence() {
        landingPage = new LandingPage(driver);
        openUrl("https://preply.com/");
        Assert.assertTrue(landingPage.preplySearchField().isDisplayed());
        Assert.assertTrue(landingPage.submitBtn().isDisplayed());
        for (int i = 0; i < landingPage.languagesTutors().size(); i++) {
            Assert.assertTrue(landingPage.languagesTutors().get(i).isDisplayed());
        }
        Assert.assertTrue(landingPage.showMore().isDisplayed());
        for (int i = 0; i < landingPage.aboutLearningBtns().size(); i++) {
            Assert.assertTrue(landingPage.aboutLearningBtns().get(i).isDisplayed());
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");


        Assert.assertTrue(landingPage.becomeATutorBtn().isDisplayed());
        Assert.assertTrue(landingPage.howItWorksLink().isDisplayed());
        for (int i = 0; i < landingPage.additionalInfo().size(); i++) {
            Assert.assertTrue(landingPage.additionalInfo().get(i).isDisplayed());
        }
    }
}

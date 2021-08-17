package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPreplyDenis.pages.FooterPage;

public class FooterTestElementsAppearance extends TestInit {
    FooterPage footerPage;

    @Test
    public void footerTestElementAppearance() {
        footerPage = new FooterPage(driver);
        openUrl("https://preply.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        for (int i = 0; i < footerPage.sectionsAndSocials().size(); i++) {
            Assert.assertTrue(footerPage.sectionsAndSocials().get(i).isDisplayed());
        }
        for (int i = 0; i < footerPage.sections().size(); i++) {
            Assert.assertTrue(footerPage.sections().get(i).isDisplayed());
        }
        Assert.assertTrue(footerPage.supportEmail().isDisplayed());
        for (int i = 0; i < footerPage.downloadAppOnStores().size(); i++) {
            Assert.assertTrue(footerPage.downloadAppOnStores().get(i).isDisplayed());
        }
        for (int i = 0; i < footerPage.typesOfTutors().size(); i++) {
            Assert.assertTrue(footerPage.typesOfTutors().get(i).isDisplayed());
        }
        for (int i = 0; i < footerPage.terms().size(); i++) {
            Assert.assertTrue(footerPage.terms().get(i).isDisplayed());
        }
    }
}

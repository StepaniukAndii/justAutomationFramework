package testAmazonDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAmazonDenis.pages.FooterPage;

public class FooterTest extends TestInit {

    FooterPage footerPage;

    @Test
    public void footerTest() {
        footerPage = new FooterPage(driver);
        openUrl("https://www.amazon.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        for (int i = 0; i < footerPage.amazonFooterElements().size(); i++) {
            Assert.assertTrue(footerPage.amazonFooterElements().get(i).isDisplayed());
        }

        Assert.assertTrue(footerPage.amazonFooterLogo().isDisplayed());
        Assert.assertTrue(footerPage.footerChangeLanguage().isDisplayed());
        Assert.assertTrue(footerPage.footerChangeCurrency().isDisplayed());
        Assert.assertTrue(footerPage.footerChangeCountry().isDisplayed());
    }
}

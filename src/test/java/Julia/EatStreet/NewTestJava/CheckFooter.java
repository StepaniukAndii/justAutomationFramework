package Julia.EatStreet.NewTestJava;

import ClasesToAllUs.BasePage;
import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.AmazonPage;
import Julia.EatStreet.Pages.EbayPage;
import Julia.EatStreet.Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFooter extends TestInit {

    @Test
    public void checkFooter() {
        AmazonPage amazonPage = new AmazonPage(driver);
        openUrl("https://www.amazon.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        for (int i = 0; i < amazonPage.footerLink().size(); i++) {
            Assert.assertTrue(amazonPage.footerLink().get(i).isDisplayed());
        }

        Assert.assertTrue(amazonPage.logoFooter().isDisplayed());
        Assert.assertTrue(amazonPage.footerChangeLanguage().isDisplayed());
        Assert.assertTrue(amazonPage.footerChangeCurrency().isDisplayed());
        Assert.assertTrue(amazonPage.footerChangeCountry().isDisplayed());
    }

    @Test
    public void checkFooterEbay(){
        EbayPage ebayPage = new EbayPage(driver);
        openUrl("https://www.ebay.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        for (int i = 0; i < ebayPage.footerLinkEbay().size(); i++){
            Assert.assertTrue(ebayPage.footerLinkEbay().get(i).isDisplayed());
        }
        Assert.assertTrue(ebayPage.footerChengeCurrency().isDisplayed());
    }
}

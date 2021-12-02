package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RestaurantTerms extends TestInit {
    @Test
    public void RestaurantTermsOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickRestaurantTerms().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/restaurant-terms-of-service"));
    }
    @Test
    public void RestaurantTermsCheckLink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickRestaurantTerms().click();
        footerPage.clickLinkRestaurantTerms().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.adr.org/"));
    }
}

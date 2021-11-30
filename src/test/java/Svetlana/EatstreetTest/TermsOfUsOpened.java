package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TermsOfUsOpened extends TestInit {
    @Test
    public void termsOfUsOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickTermsOfUs().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/terms"));
    }
    @Test
    public void termsOfUsReturnPP(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickTermsOfUs().click();
        sleep(3);
        footerPage.clickLinkPP().click();

        Assert.assertTrue(footerPage.checkPrivacyPolicyOpened().isDisplayed());
    }
}

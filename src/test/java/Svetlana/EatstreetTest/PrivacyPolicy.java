package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.concurrent.TimeUnit;

public class PrivacyPolicy extends TestInit {
    @Test
    public void privacyPolicyOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickPrivacyPolicy().click();

        Assert.assertTrue(footerPage.checkPrivacyPolicyOpened().isDisplayed());
    }

    @Test
    public void privacyPolicyRemove(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickPrivacyPolicy().click();
        footerPage.inputEmailPrivacyPolicy().sendKeys("hjhjjdgh@gmai.com");
        footerPage.selectRemove().click();
        footerPage.clickSubmit().click();

        Assert.assertTrue(footerPage.checkPrivacyPolicySendForm().isDisplayed());


    }
}

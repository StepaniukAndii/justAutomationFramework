package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.AboutUsPage;
import AleksandrKharchenko.Pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooter extends TestInit {

    @Test
    public void testCheckLinkAboutUs(){
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getAboutUsBtn().click();

        Assert.assertTrue(aboutUsPage.getTextAboutUs().isDisplayed());
    }

    @Test
    public void testCheckLinkLeadership(){
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getLeadershipBtn().click();

        Assert.assertTrue(aboutUsPage.getTextLeadership().isDisplayed());
    }
}
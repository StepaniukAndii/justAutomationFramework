package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.*;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFooter extends TestInit {

    @Test
    public void testCheckLinkAboutUs() {
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
    public void testCheckLinkLeadership() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getLeadershipBtn().click();

        Assert.assertTrue(aboutUsPage.getTextLeadership().isDisplayed());
    }

    @Test
    public void testCheckLinkInTheNews() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getInTheNewsBtn().click();
        aboutUsPage.getInTheNewsShowMoreBtn().click();

        Assert.assertTrue(aboutUsPage.getTextInNewsBtn().isDisplayed());
    }

    @Test
    public void testCheckLinkPressReleases() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getPressReleasesBtn().click();
        aboutUsPage.getShowMoreBtnPressReleases().click();

        Assert.assertTrue(aboutUsPage.getTextInNewsBtn().isDisplayed());
    }

    @Test
    public void testCheckLinkConnect() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getConnectBtn().click();

        Assert.assertTrue(aboutUsPage.getTextConnect().isDisplayed());
    }

    @Test
    public void testCheckLinkLearnMore() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getLinkLearnMore().click();
        sleep(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("/about-us"));
    }

    @Test
    public void testCheckBtnTech() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getTechBtn().click();
        careersPage.getAllLocationsLink().click();
        careersPage.getAmesCity().click();

        Assert.assertTrue(careersPage.getTextInSectionAllJobs().isDisplayed());
    }

    @Test
    public void testCheckBtnCulinaryCareers() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getCulinaryBtn().click();
        careersPage.getAllLocationsLink().click();
        careersPage.getMadisonCity().click();

        Assert.assertTrue(careersPage.getCurdNerd().isDisplayed());
    }

    @Test
    public void testCheckFieldSearchJobs() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getAmesCity().click();
        careersPage.getSearchJobsField().sendKeys("Product Analyst\n");

        Assert.assertTrue(careersPage.getTextInSectionAllJobs().isDisplayed());
    }

    @Test
    public void testCheckLinkBlog() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getLinkBlog().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("blog.eatstreet.com/"));
    }

    @Test
    public void testCheckEmailLinkCustomerService() {
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getContactUsLink().click();
        contactUsPage.getEatStreetCom().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("geteatstreet.com/"));
    }

    @Test
    public void testCheckLinkReportAnOrderIssue() {
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getContactUsLink().click();
        contactUsPage.getReportAnOrderLink().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/signin?next=~2Faccount~2Finfo"));
    }

    @Test
    public void testCheckBtnDeliveryCareersInFooter() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getDeliveryBtn().click();

        Assert.assertTrue(careersPage.getDriverDeliveryLine().isDisplayed());
    }

    @Test
    public void testFieldEmailRestaurantDashboardInFooter() {
        HomePage homePage = new HomePage(driver);
        RestaurantDashboardPage restaurantDashboardPage = new RestaurantDashboardPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getRestaurantDashboardLink().click();
        restaurantDashboardPage.getPasswordDashboardField().sendKeys("qwer1234");
        restaurantDashboardPage.getSignInDashboardBtn().click();

        Assert.assertTrue(restaurantDashboardPage.getDashboardRequiredMSG().isDisplayed());
    }

    @Test
    public void testFieldPasswordRestaurantDashboardInFooter() {
        HomePage homePage = new HomePage(driver);
        RestaurantDashboardPage restaurantDashboardPage = new RestaurantDashboardPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getRestaurantDashboardLink().click();
        sleep(1);
        restaurantDashboardPage.getEmailDashboardField().sendKeys("x-o-m@ukr.net");
        restaurantDashboardPage.getSignInDashboardBtn().click();
        sleep(1);

        Assert.assertTrue(restaurantDashboardPage.getPasswordDashboardRequiredMSG().isDisplayed());
    }

    @Test
    public void testLinkTermsOfUseInFooter() {
        HomePage homePage = new HomePage(driver);
        TermsOfUsePage termsOfUsePage = new TermsOfUsePage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getTermsOfUse().click();
        termsOfUsePage.getPrivacyLink().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/privacy"));
    }

    @Test
    public void testLinkGetFedForCustomersInFooter() {
       HomePage homePage = new HomePage(driver);
       ForCustomersPage forCustomersPage = new ForCustomersPage(driver);
       homePage.navigateHomeQa2();
       homePage.closeModal();
       sleep(2);
       homePage.getForCustomersLink().click();
       forCustomersPage.getGetFedLinkForCustomers().click();

       Assert.assertTrue(driver.getCurrentUrl().contains("eatstreet.com"));
    }

    @Test
    public void testLinkContactUsForCustomersInFooter(){
        HomePage homePage = new HomePage(driver);
        ForCustomersPage forCustomersPage = new ForCustomersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        sleep(2);
        homePage.getForCustomersLink().click();
        forCustomersPage.getContactUsLinkForCustomers().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("customers/s/contactsupport"));
    }
}
package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.RestaurantEatstreetPage;
import SerhiiBondar.Pages.TheAppPageEatstreet;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestHomePageEatstreet extends TestInit {


    @Test
    public void testBecomeADriverInSelectedCity() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getPartnerWithUsBtn().click();
        homeEatstreetPage.getApplyNowLink().click();
        sleep(2);
        Select dropCity = new Select(homeEatstreetPage.getApplyInYourCityField());
        dropCity.selectByVisibleText("Delivery Driver - Appleton, WI.");

        Assert.assertTrue(homeEatstreetPage.getDriverInCityString().getText().contains("Appleton"));
    }

    @Test
    public void testGetCareers() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getCareersBtn().click();
        sleep(2);

        Assert.assertTrue(homeEatstreetPage.getAllJobsTable().isDisplayed());
    }

    @Test
    public void testAcrossTheNation() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAtlanta().click();
        homeEatstreetPage.getBurgers().click();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        sleep(2);

        Assert.assertEquals(restaurantEatstreetPage.burgersInAtlanta().getText(),
                "Burger Delivery & Takeout in Atlanta, GA");
    }

    @Test
    public void testCustomerSupport() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getForCustomersLink().click();
        homeEatstreetPage.getFAQsLink().click();
        homeEatstreetPage.getGiftCardQuestionLink().click();

        Assert.assertEquals(homeEatstreetPage.getGiftCardQuestion().getText(), "Can I buy a gift card?");
        Assert.assertEquals(homeEatstreetPage.getAnswer().getText(), "Answer");
    }

    @Test
    public void testAppLinkWithIncorrectPhoneNumber() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getTheAppLink().click();
        TheAppPageEatstreet theAppPageEatstreet = new TheAppPageEatstreet(driver);
        theAppPageEatstreet.getAndroidBtn().click();
        theAppPageEatstreet.getCheckBoxReceiveSms().click();
        theAppPageEatstreet.getMobileNumberField().sendKeys("1278934512");
        theAppPageEatstreet.getTextLinkOrangeBtn().click();
        sleep(2);

        Assert.assertEquals(theAppPageEatstreet.SmsNotification().getText(),"SMS Not Sent");
        Assert.assertEquals(theAppPageEatstreet.SmsActionInformation().getText(),
                "Please enter a valid phone number.");
    }

    @Test
    public void testAppLinkWithCorrectedPhoneNumber() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getTheAppLink().click();
        TheAppPageEatstreet theAppPageEatstreet = new TheAppPageEatstreet(driver);
        theAppPageEatstreet.getAndroidBtn().click();
        theAppPageEatstreet.getCheckBoxReceiveSms().click();
        theAppPageEatstreet.getMobileNumberField().sendKeys("12344567897");
        theAppPageEatstreet.getTextLinkOrangeBtn().click();
        sleep(2);
        if (theAppPageEatstreet.SmsNotification().getText().equals("SMS Not Sent")) {
            theAppPageEatstreet.getOkayBtn().click();
            theAppPageEatstreet.getMobileNumberField().clear();
            theAppPageEatstreet.getMobileNumberField().sendKeys("(234) 456-7897");
            theAppPageEatstreet.getTextLinkOrangeBtn().click();
        }
        sleep(2);

        Assert.assertEquals(theAppPageEatstreet.SmsNotification().getText(), "SMS Sent!");
    }
    @Test
    public void testLogoLinkBackToHome(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        homeEatstreetPage.getLogoBtn().click();
        sleep(1);

        Assert.assertEquals(driver.getCurrentUrl(),"https://eatstreet.com/");
    }
    @Test
    public void testContactUsLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getContactUsLink().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }
    @Test
    public void testAboutUsLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        sleep(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
    }
    @Test
    public void testConnectMethods(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();

        Assert.assertTrue(homeEatstreetPage.connectionMethods().get(0).isDisplayed());
        Assert.assertTrue(homeEatstreetPage.connectionMethods().get(1).isDisplayed());
        Assert.assertTrue(homeEatstreetPage.connectionMethods().get(2).isDisplayed());
        Assert.assertTrue(homeEatstreetPage.connectionMethods().get(3).isDisplayed());
        Assert.assertTrue(homeEatstreetPage.connectionMethods().get(4).isDisplayed());
    }
    @Test
    public void testConnectWithFacebook(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();
        homeEatstreetPage.getFacebookConnectBtn().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/eatstreetHQ/");
    }
    @Test
    public void testConnectWithTwitter(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();
        homeEatstreetPage.getTwitterConnectBtn().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/eatstreet");
    }
    @Test
    public void testConnectWithInstagram(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();
        homeEatstreetPage.getInstaConnectBtn().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/eatstreethq/");
    }
    @Test
    public void testConnectWithGoogle(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();
        homeEatstreetPage.getGoogleConnectBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("accounts.google.com"));
    }
    @Test
    public void testConnectWithLinkedIn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAboutUsLink().click();
        homeEatstreetPage.getConnectLink().click();
        homeEatstreetPage.getLinkedInConnectBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("linkedin.com"));
    }
    @Test
    public void testPrivacyLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getPrivacyLink().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://eatstreet.com/privacy");
    }
    @Test
    public void testTermsOfUseLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getTermsOfUseLink().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://eatstreet.com/terms");
    }
    @Test
    public void testRestaurantsTermsLink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getRestaurantsTermsLink().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://eatstreet.com/restaurant-terms-of-service");
    }
    @Test
    public void testAccountQuestions(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getForCustomersLink().click();
        homeEatstreetPage.getAccountQuestionsSection().click();
        homeEatstreetPage.listOfQuestions().get(3).click();

        Assert.assertTrue(homeEatstreetPage.questionsTitle().getText().contains("?"));
        Assert.assertEquals(homeEatstreetPage.getAnswer().getText(), "Answer");
    }
    @Test
    public void testAccessibilityLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAccessibilityLink().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://eatstreet.com/accessibility");
    }
    @Test
    public void testAPILink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAPILink().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://developers.eatstreet.com/");
    }
    @Test
    public void testAppStoreLink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getAppStoreLink().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Assert.assertTrue(driver.getCurrentUrl().contains("apps.apple.com/us/app/eatstreet-food-delivery"));
    }
    @Test
    public void testGooglePlayLink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getGooglePlayLink().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Assert.assertTrue(driver.getCurrentUrl().contains("play.google.com/store/apps/details?id=com.eatstreet"));
    }
}
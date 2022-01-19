package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.MyAccountPage;
import AleksandrKharchenko.Pages.SignInPage;
import AleksandrKharchenko.Pages.SignUpPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSignUp extends TestInit {

    @Test
    public void testSignUpPasswordAgain() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getSignUpLink().click();
        signUpPage.getEmailFieldSignUp().sendKeys("vasya@gmail.com");
        signUpPage.getPasswordFieldSignUp().sendKeys("qwer1234");
        signUpPage.getSignUpBtn().click();
        sleep(1);

        Assert.assertTrue(signUpPage.getErrorPasswordAgainMSG().isDisplayed());
    }

    @Test
    public void testSignUpPassword() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getSignUpLink().click();
        signUpPage.getEmailFieldSignUp().sendKeys("vasya@gmail.com");
        signUpPage.getPasswordAgainFieldSignUp().sendKeys("qwer1234");
        signUpPage.getSignUpBtn().click();
        sleep(1);

        Assert.assertTrue(signUpPage.getErrorPasswordMSG().isDisplayed());
    }

    @Test
    public void testSignUpEmail() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getSignUpLink().click();
        signUpPage.getEmailFieldSignUp().sendKeys("blablabla");
        signUpPage.getPasswordFieldSignUp().sendKeys("qwer1234");
        signUpPage.getPasswordAgainFieldSignUp().sendKeys("qwer1234");

        Assert.assertTrue(signUpPage.getErrorEmailMSG().isDisplayed());
    }

    @Test
    public void testStreetAddressFieldInAddressesSectionMyAccount() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer4152sj");
        signInPage.getSignInBtn().click();
        homePage.getMyAccountLink().click();
        myAccountPage.getAddNewAddressBtn().click();
        myAccountPage.getAptNumberField().sendKeys("blablabla");
        myAccountPage.getBuildingNameField().sendKeys("blablabla");
        myAccountPage.getCityField().sendKeys("New York");
        myAccountPage.getStateField().sendKeys("NY");
        myAccountPage.getZipField().sendKeys("10001");
        myAccountPage.getAddressLabelField().sendKeys("blablabla");
        myAccountPage.getSaveBtnAddress().click();

        Assert.assertTrue(myAccountPage.getStreetAddressRequiredMSG().isDisplayed());
    }

    @Test
    public void testCityFieldInAddressesSectionMyAccount() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer4152sj");
        signInPage.getSignInBtn().click();
        homePage.getMyAccountLink().click();
        myAccountPage.getAddNewAddressBtn().click();
        myAccountPage.getStreetAddressField().sendKeys("368 9th Ave");
        myAccountPage.getAptNumberField().sendKeys("blablabla");
        myAccountPage.getBuildingNameField().sendKeys("blablabla");
        myAccountPage.getStateField().sendKeys("NY");
        myAccountPage.getZipField().sendKeys("10001");
        myAccountPage.getAddressLabelField().sendKeys("blablabla");
        myAccountPage.getSaveBtnAddress().click();

        Assert.assertTrue(myAccountPage.getCityRequiredMSG().isDisplayed());
    }

    @Test
    public void testStateFieldInAddressesSectionMyAccount() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer4152sj");
        signInPage.getSignInBtn().click();
        homePage.getMyAccountLink().click();
        myAccountPage.getAddNewAddressBtn().click();
        myAccountPage.getStreetAddressField().sendKeys("368 9th Ave");
        myAccountPage.getAptNumberField().sendKeys("blablabla");
        myAccountPage.getBuildingNameField().sendKeys("blablabla");
        myAccountPage.getCityField().sendKeys("New York");
        myAccountPage.getZipField().sendKeys("10001");
        myAccountPage.getAddressLabelField().sendKeys("blablabla");
        myAccountPage.getSaveBtnAddress().click();

        Assert.assertTrue(myAccountPage.getStateRequiredMSG().isDisplayed());
    }

    @Test
    public void testZipFieldInAddressesSectionMyAccount() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer4152sj");
        signInPage.getSignInBtn().click();
        homePage.getMyAccountLink().click();
        myAccountPage.getAddNewAddressBtn().click();
        myAccountPage.getStreetAddressField().sendKeys("368 9th Ave");
        myAccountPage.getAptNumberField().sendKeys("blablabla");
        myAccountPage.getBuildingNameField().sendKeys("blablabla");
        myAccountPage.getCityField().sendKeys("New York");
        myAccountPage.getStateField().sendKeys("NY");
        myAccountPage.getAddressLabelField().sendKeys("blablabla");
        myAccountPage.getSaveBtnAddress().click();

        Assert.assertTrue(myAccountPage.getZipRequiredMSG().isDisplayed());
    }
}
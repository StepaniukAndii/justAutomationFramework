package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.MyAccountPage;
import AleksandrKharchenko.Pages.SignInPage;
import AleksandrKharchenko.Pages.SignUpPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends TestInit {

    @Test
    public void testSignUpFieldValidationScript() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.navigateHome();
        homePage.getSignInLink().click();
        signInPage.getSignUpLink().click();
        signUpPage.getEmailFieldSignUp().sendKeys("x-o-m@ukr.net");
        signUpPage.getPasswordFieldSignUp().sendKeys("qwer1234rf");
        signUpPage.getPasswordAgainFieldSignUp().sendKeys("qwer1234rf");
        signUpPage.getSignUpBtn().click();
        sleep(2);

        Assert.assertTrue(signUpPage.getMyAccountLink().isDisplayed());
    }

    @Test
    public void testCheckEditYourInfoInMyAccountPage() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer1234rf");
        signInPage.getSignInBtn().click();
        sleep(2);
        homePage.getMyAccountLink().click();
        sleep(1);
        myAccountPage.getEditYourInfoBtn().click();
        myAccountPage.getFirstName().sendKeys("Jack");
        myAccountPage.getLastName().sendKeys("Daniels");
        myAccountPage.getEmailAddress().sendKeys("x-o-m@ukr.net");
        myAccountPage.getPhoneNumber().sendKeys("+380671234567");
        myAccountPage.getSaveBtn().click();

        Assert.assertTrue(myAccountPage.getHeadingName().isDisplayed());
    }

    @Test
    public void testChangePasswordFieldValidationScript() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer1526js");
        signInPage.getSignInBtn().click();
        sleep(3);
        homePage.getMyAccountLink().click();
        sleep(1);
        myAccountPage.getChangePasswordBtn().click();
        myAccountPage.getCurrentPasswordLink().sendKeys("qwer1526js");
        myAccountPage.getNewPasswordField().sendKeys("qwer4152sj");
        myAccountPage.getConfirmNewPasswordField().sendKeys("qwer4152sj");
        myAccountPage.getUpdatePasswordBtn().click();
        sleep(2);
        myAccountPage.getSignOutBtn().click();
        sleep(2);
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer1526js");
        signInPage.closeModal();
        signInPage.getSignInBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }

    @Test
    public void testFieldValidationScriptDeactivateAccount() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.navigateHomeQa2();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer1526js");
        signInPage.getSignInBtn().click();
        sleep(2);
        homePage.getMyAccountLink().click();
        sleep(1);
        myAccountPage.getDeactivateAccountBtn().click();
        myAccountPage.getAccountDeactivationYesBtn().click();
        sleep(1);

        Assert.assertTrue(myAccountPage.getInfoAboutDeactivation().isDisplayed());
    }

    @Test
    public void testSignUpPasswordAgain() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.navigateHomeQa2();
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
        homePage.getSignInLink().click();
        signInPage.getSignUpLink().click();
        signUpPage.getEmailFieldSignUp().sendKeys("blablabla");
        signUpPage.getPasswordFieldSignUp().sendKeys("qwer1234");
        signUpPage.getPasswordAgainFieldSignUp().sendKeys("qwer1234");
        sleep(1);

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
        signInPage.getPasswordField().sendKeys("qwer1526js");
        signInPage.getSignInBtn().click();
        sleep(3);
        homePage.getMyAccountLink().click();
        sleep(1);
        myAccountPage.getAddNewAddressBtn().click();
        myAccountPage.getAptNumberField().sendKeys("blablabla");
        myAccountPage.getBuildingNameField().sendKeys("blablabla");
        myAccountPage.getCityField().sendKeys("New York");
        myAccountPage.getStateField().sendKeys("NY");
        myAccountPage.getZipField().sendKeys("10001");
        myAccountPage.getAddressLabelField().sendKeys("blablabla");
        myAccountPage.getSaveBtnAddress().click();
        sleep(1);

        Assert.assertTrue(myAccountPage.getAptNumberRequiredMSG().isDisplayed());
    }
}
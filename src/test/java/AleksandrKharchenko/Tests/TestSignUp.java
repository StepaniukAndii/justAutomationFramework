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

}
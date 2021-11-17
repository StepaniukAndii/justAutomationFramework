package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.MyAccountPageEatstreet;
import SerhiiBondar.Pages.SingInEatstreetPage;
import SerhiiBondar.Pages.SingUpEatstreetPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginEatstreet extends TestInit {
    @Test
    public void testLogInWithIncorrectCreds() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blabla@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("1234567");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());
    }

    @Test
    public void testEmailField() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blablabla");
        singInEatstreetPage.getPasswordField().click();

        Assert.assertEquals(singInEatstreetPage.enterValidEmailAddressText().getText(),
                "Please enter a valid email address");

    }

    @Test
    public void testNewUserRegistration() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("serhiibondar2@gmail.com");
        singUpEatstreetPage.getPasswordForSignUpField().sendKeys("club2021");
        singUpEatstreetPage.getPasswordAgainField().sendKeys("club2021");
        singUpEatstreetPage.getSignUpBtn().click();
        sleep(5);

        Assert.assertTrue(homeEatstreetPage.getMyAccountBtn().size() > 0);
    }

    @Test
    public void testNegativSignUP() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("blablabla");
        singUpEatstreetPage.getPasswordForSignUpField().click();

        Assert.assertTrue(singUpEatstreetPage.wrongEnteredEmail().isDisplayed());

    }

    @Test
    public void testResetPassword() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("1234567");
        singInEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getResetPassword().click();
        sleep(3);
        singInEatstreetPage.getEmailResetPassword().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getResetPasswordBtn().click();
        sleep(2);

        Assert.assertEquals(singInEatstreetPage.getTextOnModalResetPasswordWindow().getText(),
                "Instructions have been sent to your email address.");
    }

    @Test
    public void testLoginWithCorrectCreds() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(homeEatstreetPage.getMyAccountBtn().size() > 0);
    }

    @Test
    public void testLoginWithIncorrectPassword() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("12345678");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());
    }

    @Test
    public void testLoginWithIncorrectEmail() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blablabla@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());
    }

    @Test
    public void testConfirmationPassword() {
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("serhiibondar2@gmail.com");
        singUpEatstreetPage.getPasswordForSignUpField().sendKeys("club2021");
        singUpEatstreetPage.getPasswordAgainField().sendKeys("club0000");
        singUpEatstreetPage.getSignUpBtn().click();

        Assert.assertTrue(singUpEatstreetPage.getMustMachString().isDisplayed());
    }


}
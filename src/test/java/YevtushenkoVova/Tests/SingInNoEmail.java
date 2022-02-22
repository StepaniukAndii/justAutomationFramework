package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.SingIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInNoEmail extends TestInit {
    @Test
    public void singInNoEmail() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.inputPassword().sendKeys("Qwert@54321");
        singIn.getSignInBTN().click();
        getElement("//div[@id='email-validation-tag']");

        Assert.assertTrue(singIn.emailErrorRequired().isDisplayed());
    }

    @Test
    public void singInNoPassword() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.inputEmail().sendKeys("Qwe34@gmail.com");
        singIn.getSignInBTN().click();
        getElement("//span[@ng-if=\"signinCtrl.loginInvalid\"]");

        Assert.assertTrue(singIn.passwordError().isDisplayed());
    }

    @Test
    public void inValid() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.inputEmail().sendKeys("HJKHb12@ukr.net");
        singIn.inputPassword().sendKeys("qsqw292JKJ");
        getElement("//a[@id=\"menu-signin\"]");

        Assert.assertTrue(singIn.menuSignin().isDisplayed());
    }

    @Test
    public void noValue() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.getSignInBTN().click();
        getElement("//div[@id='email-validation-tag']");

        Assert.assertTrue(singIn.emailErrorRequired().isDisplayed());
    }

    @Test
    public void passwordAgain() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.linkSingUp().click();

        Assert.assertTrue(singIn.passwordAgain().isDisplayed());
    }

    @Test
    public void resetPassword() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.linkRestPassword().click();

        Assert.assertTrue(singIn.windowRest().isDisplayed());
    }
}
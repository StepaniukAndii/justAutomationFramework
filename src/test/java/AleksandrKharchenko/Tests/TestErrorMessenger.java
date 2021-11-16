package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.SignInPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestErrorMessenger extends TestInit {

    @Test
    public void testCheckErrorNotificationOnSignInPage() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.navigateSignIn();
        signInPage.getEmailField().sendKeys("dhsehaehaegareg");
        signInPage.getPasswordField().sendKeys("dhsehaehaegareg");
        signInPage.closeModal();
        signInPage.getSignInBtn().click();
        sleep(2);

        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }

    @Test
    public void testToShortPasswordOnSignIn() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.navigateHomeQa2();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("0");
        signInPage.closeModal();
        signInPage.getSignInBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }

    @Test
    public void testToIncorrectEmailOnSignIn() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.navigateHomeQa2();
        homePage.getSignInLink().click();
        signInPage.closeModal();
        signInPage.getPasswordField().sendKeys("qwer1234");
        signInPage.getSignInBtn().click();
        sleep(2);

        Assert.assertTrue(signInPage.getEmailRequiredMSG().isDisplayed());
    }
}
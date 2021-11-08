package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
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
}
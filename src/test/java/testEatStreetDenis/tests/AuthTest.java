package testEatStreetDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.AuthPage;

public class AuthTest extends TestInit {

    AuthPage authPage;

    @Test
    public void auth() {
        authPage = new AuthPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        authPage.homePage().signIn().click();
        //sign in (will be modified)
        authPage.signInWithFacebook().click();
        authPage.authWithGoogle().click();
        authPage.email().sendKeys("fellowastronomer@gmail.com");
        authPage.pass().sendKeys("12345678");
        authPage.showPass().click();
        authPage.resetPassword().click();
        authPage.cancelModalWindow().click();
        authPage.authConfirm().click();
        //sign up (will be modified)
        authPage.signUp().click();
        authPage.signUpWithFacebook().click();
        authPage.authWithGoogle().click();
        authPage.email().sendKeys("fellowastronomer@gmail.com");
        authPage.pass().sendKeys("12345678");
        authPage.passConfirm().sendKeys("12345678");
        authPage.showPass().click();
        authPage.authConfirm().click();
        authPage.signIn().click();
    }
}

package testEatStreetDenis.tests.header.authTest;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.AuthPage;

public class AuthTest extends TestInit {

    AuthPage authPage;

    @Test
    public void auth() {
        authPage = new AuthPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        authPage.headerPage().signIn().click();
        //checking SignIn
        signIn("fellowastronomer@gmail.com", "echo0059");
        authPage.signUp().click();
        authPage.signIn().click();
        driver.navigate().back();
        //checking SignUp
        signUp("testingaccount@gmail.com", "@lpha1082.br!vo");
    }

    private void signUp(String email, String pass) {
        sideServicesSignUp();
        authPage.email().sendKeys(email);
        authPage.pass().sendKeys(pass);
        authPage.passConfirm().sendKeys(pass);
        authPage.showPass().click();
        authPage.authConfirm().click();
    }

    private void signIn(String email, String pass) {
        sideServicesSignIn();
        authPage.email().sendKeys(email);
        authPage.pass().sendKeys(pass);
        authPage.showPass().click();
        authPage.resetPassword().click();
        authPage.cancelModalWindow().click();
        authPage.authConfirm().click();
    }

    private void sideServicesSignUp() {
        authPage.signUpWithFacebook().click();
        authPage.authWithGoogle().click();
    }

    private void sideServicesSignIn() {
        authPage.signInWithFacebook().click();
        authPage.authWithGoogle().click();
    }
}

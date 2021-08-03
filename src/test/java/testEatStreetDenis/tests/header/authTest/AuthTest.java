package testEatStreetDenis.tests.header.authTest;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.header.AuthPage;

public class AuthTest extends TestInit {

    AuthPage authPage;

    @Test
    public void checkAuthElements() {
        authPage = new AuthPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        authPage.headerPage().openSignIn().click();
        //checking SignIn

        signIn("fellowastronomer@gmail.com", "echo0059");
        authPage.signUpTransfer().click();
        authPage.signInTransfer().click();
        driver.navigate().back();
        //checking SignUp
        signUp("testingaccount@gmail.com", "@lpha1082.br!vo");
    }

    private void signUp(String email, String pass) {
        sideServicesSignUp();
        authPage.inputEmail().sendKeys(email);
        authPage.inputPass().sendKeys(pass);
        authPage.passConfirm().sendKeys(pass);
        authPage.showPass().click();
        authPage.authConfirm().click();
    }

    private void signIn(String email, String pass) {
        sideServicesSignIn();
        authPage.inputEmail().sendKeys(email);
        authPage.inputPass().sendKeys(pass);
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

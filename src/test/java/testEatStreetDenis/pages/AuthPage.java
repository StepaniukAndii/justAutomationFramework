package testEatStreetDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage extends BasePage {

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }

    public WebElement signInWithFacebook() {
        return findElementByXpath("//a [@ng-click='signinCtrl.fbsignin()']");
    }

    public WebElement signUpWithFacebook() {
        return findElementByXpath("//a [@ng-click='signinCtrl.fbsignin(true)']");
    }

    public WebElement authWithGoogle() {
        return findElementByXpath("//div [@id='uniqueid']");
    }

    public WebElement email() {
        return findElementByXpath("//input [@name='email']");
    }

    public WebElement pass() {
        return findElementByXpath("//input [@name='password']");
    }

    public WebElement passConfirm() {
        return findElementByXpath("//input [@name='passwordAgain']");
    }

    public WebElement showPass() {
        return findElementByXpath("//div [@ng-if='displayPasswordToggler']");
    }

    public WebElement resetPassword() {
        return findElementByXpath("//span [@id='forgot-password']");
    }

    public WebElement cancelModalWindow() {
        return findElementByXpath("//a [@id='cancel-modal-btn']");
    }

    public WebElement authConfirm() {
        return findElementByXpath("//button [@type='submit']");
    }

    public WebElement signUp() {
        return findElementByXpath("//a [@href='/create-account?next=~2F']");
    }

    public WebElement signIn() {
        return findElementByXpath("//a [@ui-sref='signin({nextState: nextState, next: next, alertText: signinCtrl.alertText})']");
    }
}

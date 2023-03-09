package testEatStreetDenis.pages.header;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage extends BasePage {

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public HeaderPage headerPage() {
        return new HeaderPage(driver);
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

    public WebElement inputEmail() {
        return findElementByXpath("//input [@name='email']");
    }

    public WebElement inputPass() {
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

    public WebElement signUpTransfer() {
        return findElementByXpath("//a [@href='/create-account?next=~2F']");
    }

    public WebElement signInTransfer() {
        return findElementByXpath("//a [contains(@ui-sref,'signin')]");
    }
}

package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public SignUpStudentPage signUpStudentPage() {
        return new SignUpStudentPage(driver);
    }

    public SignUpTutorPage signUpTutorPage() {
        return new SignUpTutorPage(driver);
    }

    public List<WebElement> logInWithFacebookOrGoogle() {
        return findElementsByXpath("//a [@data-pfb-path-param='prev:/en/login']");
    }

    public WebElement emailField() {
        return findElementByXpath("//input [@id='id_email']");
    }

    public WebElement passwordField() {
        return findElementByXpath("//input [@type='password']");
    }

    public WebElement forgotPasswordLink() {
        return findElementByXpath("//a [@id='forgot_password']");
    }

    public WebElement rememberMeCheckBox() {
        return findElementByXpath("//span [contains(@class,'checkbox__label')]");
    }

    public WebElement loginButton() {
        return findElementByXpath("//button [@id='login_button']");
    }

    public WebElement studentSignUpTransfer() {
        return findElementByXpath("//a [@data-qa-id='sign-up-student-link']");
    }

    public WebElement tutorSignUpTransfer() {
        return findElementByXpath("//a [@data-ga-label='Sign_up_as_tutor']");
    }
}

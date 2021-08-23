package testAmazonDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AuthPage extends BasePage {
    public AuthPage(WebDriver driver) {
        super(driver);
    }
    public WebElement amazonLogIn() { //when header test will be added - delete this
        return findElementByXpath("//a [@id='nav-link-accountList']");
    }

    public WebElement signInLogo() {
        return findElementByXpath("//i [@class='a-icon a-icon-logo']");
    }

    public WebElement authEmail() {
        return findElementByXpath("//input [@id='ap_email']");
    }

    public WebElement authName() {
        return findElementByXpath("//input [@id='ap_customer_name']");
    }

    public WebElement authPassword() {
        return findElementByXpath("//input [@id='ap_password']");
    }

    public WebElement authConfirmPassword() {
        return findElementByXpath("//input [@id='ap_password_check']");
    }

    public WebElement supportLink() {
        return findElementByXpath("//span [@class='a-expander-prompt']");
    }

    public WebElement createAccountBtn() {
        return findElementByXpath("//a [@id='createAccountSubmit']");
    }

    public List<WebElement> termsAndPolicyAmazon() {
        return findElementsByXpath("//a [@rel='noopener']");
    }

    public WebElement authConfirmBtn() {
        return findElementByXpath("//input [@id='continue']");
    }

    public WebElement switchToSignIn() {
        return findElementByXpath("//a [@class='a-link-emphasis']");
    }

    public WebElement createBusinessAccount() {
        return  findElementByXpath("//a [@id='ab-registration-link']");
    }


}

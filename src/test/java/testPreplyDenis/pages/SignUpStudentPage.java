package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpStudentPage extends BasePage {
    public SignUpStudentPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> signUpWithFacebookOrGoogle() {
        return findElementsByXpath("//a [@data-pfb-path-param='prev:/en/signup']");
    }

    public WebElement logInTransfer() {
        return findElementByXpath("//span [@class='h1_right__divider']");
    }

    public WebElement signUpBtn() {
        return findElementByXpath("//button [@id='signup_button']");
    }

    public List<WebElement> termsAndPolicy() {
        return findElementsByXpath("//a [@class='underline m']");
    }
}

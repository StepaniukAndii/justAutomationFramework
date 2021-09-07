package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpTutorPage extends BasePage {
    public SignUpTutorPage(WebDriver driver) {
        super(driver);
    }

    public WebElement emailInputField() {
        return findElementByXpath("//input [@id='upperform-signup-email-input']");
    }

    public WebElement passwordInputField() {
        return findElementByXpath("//input [@id='upperform-signup-pw-input']");
    }

    public WebElement submitBtn() {
        return findElementByXpath("//button [@data-qa-id='submit']");
    }

    public List<WebElement> continueWithFacebookOrGoogle() {
        return findElementsByXpath("//a [contains(@class,'Button_l__3M9Ff Button_fullWidth__3tf7a')]");
    }

    public List<WebElement> termsAndPolicy() {
        return findElementsByXpath("//div[contains(@class, 'AgreementText___16ilf')]//a [@target='_blank']");
    }

    public WebElement jumpToSignUpBtn() {
        return findElementByXpath("//button [contains(@class,'SignupButton___OIOSf')]");
    }

    public WebElement becomeATutorBtn() {
        return findElementByXpath("//button [contains(@class,'BecomeTutorButton___cHwj3')]");
    }

    public List<WebElement> faqOpen() {
        return findElementsByXpath("//span [@class='QuestionIcon___A_ASa']");
    }

    public List<WebElement> supportLinks() {
        return findElementsByXpath("//div [@class='SupportText___LJxeh']//a [@class='Link_link__rLrO8']");
    }

    public WebElement getStartedBtn() {
        return findElementByXpath("//button [contains(@class,'GetStartedButton___3Xz5d')]");
    }
}

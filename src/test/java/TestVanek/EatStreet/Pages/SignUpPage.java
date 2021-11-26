package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement emailInput(){
        return findElementByXpath("//input[contains(@name,'email')]");
    }

    public WebElement passwordInput(){
        return findElementByXpath("//input[contains(@name,'password')]");
    }

    public WebElement passwordAgainInput(){
        return findElementByXpath("//input[contains(@name,'passwordAgain')]");
    }

    public WebElement signUpBtn(){
        return findElementByXpath("//button[contains(@id,'signUp')]");
    }

    public WebElement signUpFacebookBtn(){
        return findElementByXpath("//a[contains(@class,'btn-facebook')]");
    }

    public WebElement signUpGoogleBtn(){
        return findElementByXpath("//div[contains(@class,'google')]");
    }

    public WebElement emailValidationError(){
        return findElementByXpath("//div[contains(@id,'email')]");
    }

    public WebElement passwordValidationError(){
        return findElementByXpath("//div[contains(@id,'password')]");
    }
}

package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver){
        super(driver);
    }
    public WebElement enterEmail(){
        return findElementByXpath("//input[@id='email']");
    }
    public WebElement enterPassword(){
        return findElementByXpath("//input[@id='password']");
    }
    public WebElement enterPasswordAgain(){
        return findElementByXpath("//input[@id='passwordAgain']");
    }
    public WebElement pressSignUpBtn(){
        return findElementByXpath("//button[@id='signup']");
    }
    public WebElement checkValidationEmail(){
        return findElementByXpath("//div[@id='email-validation-tag']");
    }
    public WebElement checkValidationPassword(){
        return findElementByXpath("//div[@id='password-validation-tag']");
    }

}

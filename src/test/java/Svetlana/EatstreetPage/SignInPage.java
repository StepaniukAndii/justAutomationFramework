package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver){
        super(driver);
    }
    public WebElement EnterEmail(){
        return findElementByXpath("//input[@id='email']");
    }
    public WebElement EnterPassword(){
        return findElementByXpath("//input[@id='password']");
    }
    public WebElement pressSignInBtn(){
        return findElementByXpath("//button[@id='signin']");
    }
    public WebElement pressGoItBtn(){
        return findElementByXpath("//button[@class='btn']");
    }
    public WebElement pressSignUpLink(){
        return findElementByXpath("//a[contains(@ui-sref,'sign')]");
    }
    public WebElement checkValidationPassword(){
        return findElementByXpath("//span[@class='alert text-red ng-scope']");
    }
    public WebElement loginUsingGoogl(){
        return findElementByXpath("//div[@id='uniqueid']");
    }
    public WebElement getWithFC(){
        return findElementByXpath("//a[contains(@class,'btn-facebook')]");
    }
    public WebElement getWithGoogl(){
        return findElementByXpath("//div[contains(@class,'btn-google')]");
    }



}

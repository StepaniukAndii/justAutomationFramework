package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){ super(driver); }

    public WebElement emailInput(){
        return findElementByXpath("//input[@name='email']");
    }

    public WebElement passwordInput(){
        return findElementByXpath("//input[@name='password']");
    }

    public WebElement signInBtn(){
        return findElementByXpath("//button[@class='btn btn-action btn--orange btn-sign-in-hcn ng-scope']");
    }

    public WebElement signInFacebookBtn(){
        return findElementByXpath("//a[contains(@class,'facebook_')]");
    }

    public WebElement modalError(){
        return findElementByXpath("//span[@class='alert text-red ng-scope']");
    }
}
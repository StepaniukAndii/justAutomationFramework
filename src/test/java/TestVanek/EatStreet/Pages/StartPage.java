package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){ super(driver); }

    public WebElement signInBtn(){
        return findElementByXpath("//a[@class='btn btn-sign-in visible_focus ng-scope btn-sign-in-alternate remove-margin']");
    }
    public WebElement searchAddressInput(){
        return findElementByXpath("//input[@ng-model='searchParam']");
    }
    public WebElement getFedBtn(){
        return findElementByXpath("//a[@class='btn btn-action btn-food-search btn-food-search--home full-width visible_focus']");
    }
    public WebElement addressSearchAttemptEnter(){
        return findElementByXpath("//a[@class='btn btn-primary float-right']");
    }
    public  WebElement myAccounBtn(){
        return findElementByXpath("//a[contains(@id,'menu')]");
    }
}
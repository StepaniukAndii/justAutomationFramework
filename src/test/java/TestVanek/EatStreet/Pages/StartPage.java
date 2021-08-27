package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){ super(driver); }

    public WebElement signInBtn(){
        return findElementByXpath("//a[@class='btn btn-sign-in visible_focus ng-scope btn-sign-in-alternate remove-margin']");
    }
}
package TestVanek.Mychords.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver){super(driver);}

    public WebElement logInInput(){
        return findElementByXpath("//input[@name='login']");
    }
    public WebElement passInput(){
        return findElementByXpath("//input[@name='password']");
    }
    public WebElement logInBtn() {
        return findElementByXpath("//input[@class='b-login__submit pure-button pure-button-primary']");
    }
}

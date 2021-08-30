package TestVanek.Mychords.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){super(driver);}

    public WebElement LogInBtn(){
        return findElementByXpath("//button[@class='pure-button pure-button-only-hover']");
    }
    public WebElement userLogin(){
        return findElementByXpath("//div[@class='b-user-name']");
    }
}

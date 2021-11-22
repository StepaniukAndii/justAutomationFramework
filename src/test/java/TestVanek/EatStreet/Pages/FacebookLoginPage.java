package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends BasePage {
    public FacebookLoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFacebookLoginPage(){
        return findElement("//html[@id='facebook']");
    }
}

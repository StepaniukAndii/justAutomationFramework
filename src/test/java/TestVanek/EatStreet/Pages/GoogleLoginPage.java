package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginPage extends BasePage {
    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement signInWithGoogleText(){
        return findElementByXpath("//div[contains(text(),'Google')]");
    }
}

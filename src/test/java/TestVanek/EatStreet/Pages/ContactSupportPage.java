package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactSupportPage extends BasePage {
    public ContactSupportPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> inputs(){
        return findElementsByXpath("//input");
    }
    public List<WebElement> helpTextAlert(){
        return findElementsByXpath("//div[contains(@id,'help')]");
    }
}

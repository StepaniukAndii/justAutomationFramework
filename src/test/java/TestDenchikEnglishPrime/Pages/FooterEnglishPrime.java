package TestDenchikEnglishPrime.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterEnglishPrime extends BasePage {


    public FooterEnglishPrime(WebDriver driver){
        super(driver);
    }
    public WebElement facebookLinkButton(){
        return findElementByXpath("//a[contains(@href,'https://www.facebook.com/EnglishPrime/')]");
    }
}

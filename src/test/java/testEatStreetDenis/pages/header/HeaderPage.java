package testEatStreetDenis.pages.header;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {
    
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return findElementByXpath("//img [contains(@class,'logo-alternate')]");
    }

    public WebElement transferToPartnerWithUsSection() {
        return findElementByXpath("//a [contains(@class,'partners-link ng-scope')]");
    }

    public WebElement openSignIn() {
        return findElementByXpath("//div [contains(@class,'is-clickable')]");
    }

    public WebElement openCart() {
        return findElementByXpath("//li [contains(@class,'is-clickable')]");
    }

    public WebElement cartSection() {
        return findElementByXpath("//div [contains(@class, 'widget widget--cart')]");
    }
}

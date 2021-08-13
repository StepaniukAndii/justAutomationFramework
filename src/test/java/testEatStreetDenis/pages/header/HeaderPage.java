package testEatStreetDenis.pages.header;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {
    
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement logo() {
        return findElementByXpath("//img [@class='logo-alternate']");
    }

    public WebElement partnerWithUs() {
        return findElementByXpath("//a [@class='partners-link ng-scope']");
    }

    public WebElement signIn() {
        return findElementByXpath("//div [contains(@class, 'is-clickable')]");
    }

    public WebElement cart() {
        return findElementByXpath("//li [@class='is-clickable']");
    }
}

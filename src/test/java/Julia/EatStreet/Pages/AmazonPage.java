package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonPage extends BasePage {

    public AmazonPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> footerLink(){
        return findElementsByXpath("//a [@class='nav_a']");
    }

    public WebElement logoFooter() {
        return findElementByXpath("//div [@class='nav-logo-base nav-sprite']");
    }

    public WebElement footerChangeLanguage() {
        return findElementByXpath("//a [@id='icp-touch-link-language']");
    }

    public WebElement footerChangeCurrency() {
        return findElementByXpath("//a [@id='icp-touch-link-cop']");
    }

    public WebElement footerChangeCountry() {
        return findElementByXpath("//a [@id='icp-touch-link-country']");
    }
}

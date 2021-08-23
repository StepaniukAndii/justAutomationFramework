package testAmazonDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> amazonFooterElements() {
        return findElementsByXpath("//a [@class='nav_a']");
    }

    public WebElement amazonFooterLogo() {
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

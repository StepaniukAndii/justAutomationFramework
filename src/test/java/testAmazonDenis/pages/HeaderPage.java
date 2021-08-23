package testAmazonDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement amazonLogo() {
        return findElementByXpath("//a [@id='nav-logo-sprites']");
    }

    public WebElement deliverTo() {
        return findElementByXpath("//a [@id='nav-global-location-popover-link']");
    }

    public WebElement searchInSection() {
        return findElementByXpath("//div [@id='nav-search-dropdown-card']");
    }

    public WebElement amazonSearchField() {
        return findElementByXpath("//input [@id='twotabsearchtextbox']");
    }

    public WebElement amazonConfirmSearchBtn() {
        return findElementByXpath("//input [@id='nav-search-submit-button']");
    }

    public WebElement selectLanguage() {
        return findElementByXpath("//a [@id='icp-nav-flyout']");
    }

    public WebElement changeLanguageAndCurrency() {
        return findElementByXpath("//a [@id='icp-nav-flyout']");
    }

    public WebElement accountAndLists() {
        return findElementByXpath("//a [@id='nav-link-accountList']");
    }

    public WebElement returnsAndOrders() {
        return findElementByXpath("//a [@id='nav-orders']");
    }

    public WebElement amazonCart() {
        return findElementByXpath("//a [@id='nav-cart']");
    }
}

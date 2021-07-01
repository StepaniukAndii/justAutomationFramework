package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderMenuPage extends BasePage {
    public HeaderMenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> authMenu() {
        return findElementsByXpath("//button [@class='button button--link side-menu__auth-button ng-tns-c5-0 ng-star-inserted']");
    }

    public HeaderPage headerPageFunctions() {
        return new HeaderPage(driver);
    }

    public WebElement premiumMenu() {
        return findElementByXpath("//a [@class='premium-side ng-star-inserted']");
    }

    public List<WebElement> catalogueAndCartMenu() {
        return findElementsByXpath("//button [@class='button button--large side-menu__button']");
    }

    public WebElement helpCenterMenu() {
        return findElementByXpath("//a [@class='button button--large side-menu__button']");
    }

    public WebElement phoneNumberMenu() {    //If you using this one - always add closing pop-up function
        return findElementByXpath("//a [@class='button button--large side-menu__button ng-tns-c5-0 ng-star-inserted']");
    }

    public WebElement languageMenu() {
        return findElementByXpath("//li [@class='lang__item __item ng-star-inserted']");
    }

    public WebElement cityMenu() {
        return findElementByXpath("//button [@class='city-toggle button button--small button--white']");
    }

    public WebElement chevronsMenu() { //At first recommended to use this, to simplify work with infoMenu
        return findElementByXpath("//button [@class='button button--medium button--white button--icon side-links__toggle ng-star-inserted']");
    }

    public List<WebElement> infoMenu() {
        return findElementsByXpath("//a [@class='ng-tns-c20-2']");
    }

    public List<WebElement> appStoresMenu() {
        return findElementsByXpath("//a [@class='side-stores__button']");
    }

    public WebElement menuCloseMenu() {
        return findElementByXpath("//button [@class='side-menu__close']");
    }

    public ProductPage productPageFunctions() {
        return new ProductPage(driver);
    }
}

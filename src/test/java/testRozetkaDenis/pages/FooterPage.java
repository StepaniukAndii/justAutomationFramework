package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public HeaderPage headerPageFunctions() {
        return new HeaderPage(driver);
    }

    public ProductPage productPageFunctions() {
        return new ProductPage(driver);
    }

    public WebElement callCenterGraphics() {
        return findElementByXpath("//a[@class='button button--small button--with-icon button--link footer-top__schedule']");
    }

    public List<WebElement> footerInfo() {
        return findElementsByXpath("//a [@class='ng-tns-c20-1']");
    }

    public List<WebElement> footerApps() {
        return findElementsByXpath("//a [@class='footer-stores__button']");
    }

    public List<WebElement> footerSocials() {
        return findElementsByXpath("//li [@class='socials__list-item ng-star-inserted']");
    }

    public List<WebElement> footerPayments() {
        return findElementsByXpath("//button [@class='payments-buttons__button']");
    }
}

package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelpCenterPage extends BasePage {
    public HelpCenterPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage productPageFunctions() {
        return new ProductPage(driver);
    }

    public WebElement openHelpCenter() {
        return findElementByXpath("//a [@class='button button--medium button--with-icon main-links__help ng-star-inserted']");
    }

    public List<WebElement> faq1() {
        return findElementsByXpath("//a [contains(text(), '?')]");
    }

    public List<WebElement> supportInfo() {
        return findElementsByXpath("//a [@class='link']");
    }
}

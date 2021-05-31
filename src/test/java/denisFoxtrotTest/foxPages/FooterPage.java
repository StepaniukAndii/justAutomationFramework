package denisFoxtrotTest.foxPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> footerButtons() {
        return findElementsByXpath("//div [@class='footer__text']");
    }

    public WebElement phone() {
        return findElementByXpath("//a [@class='footer__service-number']");
    }

    public WebElement email() {
        return findElementByXpath("//a [@class='footer__email']");
    }
}

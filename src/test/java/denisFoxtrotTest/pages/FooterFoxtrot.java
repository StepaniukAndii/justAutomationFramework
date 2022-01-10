package denisFoxtrotTest.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterFoxtrot extends BasePage {
    public FooterFoxtrot(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> footerButtons() {
        return findElementsByXpath("//div [@class='footer__text']");
    }
}

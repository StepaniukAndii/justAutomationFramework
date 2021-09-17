package testEatStreetDenis.pages.footer;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getFooterElements() {
        return findElementsByXpath("//div [@class='es-footer__top']//a");
    }

    public List<WebElement> getFooterSocials() {
        return findElementsByXpath("//ul [@aria-label='Social media links']//a");
    }

    public CharSequence openNewTab() {
        return Keys.chord(Keys.CONTROL, Keys.RETURN);
    }
}

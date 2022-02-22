package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class EbayPage extends BasePage {

    public EbayPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> footerLinkEbay() {
        return findElementsByXpath("//a [@class='thrd']");
    }

    public WebElement footerChengeCurrency() {
        return findElementByXpath("//a [@id='gf-fbtn']");
    }
}

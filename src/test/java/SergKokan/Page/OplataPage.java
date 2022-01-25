package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class OplataPage extends BasePage {
    public OplataPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedTextOplata() {
        return findElementByXpath("//h2").isDisplayed();
    }
}

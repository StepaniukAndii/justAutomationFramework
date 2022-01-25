package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class DostavkaPage extends BasePage {
    public DostavkaPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedTextDostavka() {
        return findElementByXpath("//h2[@class='static-page__header']").isDisplayed();
    }
}

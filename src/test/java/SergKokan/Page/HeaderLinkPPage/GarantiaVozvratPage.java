package SergKokan.Page.HeaderLinkPPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

public class GarantiaVozvratPage extends BasePage {
    public GarantiaVozvratPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedTexGarantiaVozvrat() {
        return findElementByXpath("//h2[@class='static-page__header']").isDisplayed();
    }
}

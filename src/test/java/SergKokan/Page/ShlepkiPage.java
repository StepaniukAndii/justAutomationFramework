package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShlepkiPage extends BasePage {
    public ShlepkiPage(WebDriver driver){
        super(driver);
    }

    public WebElement btnShlepki() {
        return findElementByXpath("//span[contains(text(), 'Шльопанці')]");
    }

    public WebElement textShlepki() {
        return findElementByXpath("//h1[contains(text(), 'Шльопанці')]");
    }
}

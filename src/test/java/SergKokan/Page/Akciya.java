package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Akciya extends BasePage {
    public Akciya(WebDriver driver){
        super(driver);
    }

    public WebElement btnAkciya() {
        return findElementByXpath("//div[@class='header__link header-bottom__nav-link']/a[contains(text(), 'АКЦІЇ')]");
    }

    public WebElement textAkciya() {
        return findElementByXpath("//h1[contains(text(), 'АКЦІЇ')]");
    }
}

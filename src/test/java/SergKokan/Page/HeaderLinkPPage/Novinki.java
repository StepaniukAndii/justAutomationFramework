package SergKokan.Page.HeaderLinkPPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Novinki extends BasePage {
    public Novinki(WebDriver driver) {
        super(driver);

    }

    public WebElement btnNovinki() {
        return findElementByXpath("//div[@class='header__link header-bottom__nav-link']//a[contains(text(), 'НОВИНКИ')]");
    }

    public WebElement textNovinki() {
        return findElementByXpath("//h1[@class='catalog-main-header']");
    }
}

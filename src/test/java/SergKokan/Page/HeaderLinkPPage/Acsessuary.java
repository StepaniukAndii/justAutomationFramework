package SergKokan.Page.HeaderLinkPPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Acsessuary extends BasePage {
    public Acsessuary(WebDriver driver) {
        super(driver);
    }

    public WebElement btnAcsessuary() {
        return findElementByXpath("//div[@class='header__link header-bottom__nav-link']/a[contains(text(), 'АКСЕСУАРИ')]");
    }

    public WebElement textAcsessuary() {
        return findElementByXpath("//div[@class='product-katalog']//h1[contains(text(), 'АКСЕСУАРИ')]");
    }
}

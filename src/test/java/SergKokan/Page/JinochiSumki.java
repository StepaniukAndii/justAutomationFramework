package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JinochiSumki extends BasePage {
    public JinochiSumki(WebDriver driver) {
        super(driver);
    }

    public WebElement btnJinochiSumki() {
        return findElementByXpath("//div[@class='header__link header-bottom__nav-link']/a[contains(text(), 'ЖІНОЧІ СУМКИ')]");
    }

    public WebElement textJinochiSumki() {
        return findElementByXpath("//h1[@class='catalog-main-header']");
    }
}

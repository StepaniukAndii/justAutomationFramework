package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CholovichiSumki extends BasePage {
    public CholovichiSumki(WebDriver driver) {
        super(driver);
    }

    public WebElement btnCholovichiSumki() {
        return findElementByXpath("//div[@class='header__link header-bottom__nav-link']//a[contains(text(), 'ЧОЛОВІЧІ СУМКИ')]");
    }

    public WebElement textCholovichiSumki() {
        return findElementByXpath("//h1[@class='catalog-main-header']");
    }
}

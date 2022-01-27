package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mugskaya extends BasePage {
    public Mugskaya(WebDriver driver) {
        super(driver);

    }

    public WebElement btnMugskaya() {
        return findElementByXpath("//div[@class='header_nav-list_mob']//a[contains(text(), 'ЧОЛОВІЧЕ ВЗУТТЯ')]");

    }

    public WebElement textMugskaya() {
        return findElementByXpath("//h1[@class='catalog-main-header']");
    }
}

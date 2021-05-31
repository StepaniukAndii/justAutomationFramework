package denisFoxtrotTest.foxPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement foxtrot() {
        return findElementByXpath("//img [@alt='foxtrot']");
    }

    public WebElement productOfDay() {
        return findElementByXpath("//li [@id='productsOfTheDayLink']");
    }

    public List<WebElement> headerButtons() {
        return findElementsByXpath("//a [@class='jslink nowrap']");
    }

    public List<WebElement> headerChevrons() {
        return findElementsByXpath("//i [@class='icon icon-chevron-down']");
    }

    public List<WebElement> language() {
        return findElementsByXpath("//a [@data-lang]");
    }

    public WebElement authPopUp() {
        return findElementByXpath("//div [@class='header__sub-user unselectable js-open-auth-popup']");
    }

    public WebElement popUpClose() {
        return findElementByXpath("//div [@class='popup__close']");
    }

    public WebElement compare() {
        return findElementByXpath("//div [@class='header-tooltip unselectable']");
    }

    public WebElement favorite() {
        return findElementByXpath("//div [@class='header-favorite']");
    }

    public WebElement bonus() {
        return findElementByXpath("//span [@id='bonus-container']");
    }

    public WebElement sales() {
        return findElementByXpath("//a [@class='nowrap header__categories-sale outlet-link']");
    }

    public WebElement promo() {
        return findElementByXpath("//a [@class='header__categories-promo']");
    }

    public WebElement catalogue() {
        return findElementByXpath("//a [@class='js-hover-catalog']");
    }

    public  List<WebElement> catalogueCategories() {
        return findElementsByXpath("//li [@class='js-hover-catalog-category']");
    }
}

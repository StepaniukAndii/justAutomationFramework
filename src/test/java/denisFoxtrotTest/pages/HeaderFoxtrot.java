package denisFoxtrotTest.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderFoxtrot extends BasePage {
    public HeaderFoxtrot(WebDriver driver) {
        super(driver);
    }

    public WebElement headerAdClick() {
        return findElementByXpath("//a [@id='top-banner']");
    }

    public WebElement headerDailyProduct() {
        return findElementByXpath("//a [@class='nowrap']");
    }

    public List<WebElement> headerTOPPropSalesAdresses() {
        return findElementsByXpath("//a [@class='jslink nowrap']");
    }

    public WebElement headerForCustomers() {
        return findElementByXpath("//div [@class='header__sub-buyers unselectable']");
    }

    public WebElement headerContacts() {
        return findElementByXpath("//div [@class='header__sub-contacts unselectable']");
    }

    public WebElement headerLangUA() {
        return findElementByXpath("//a [@data-lang='uk']");
    }

    public WebElement headerLangRU() {
        return findElementByXpath("//a [@data-lang='ru']");
    }

    public WebElement headerAuthPopUp() {
        return findElementByXpath("//div [@class='header__sub-user unselectable js-open-auth-popup']");
    }

    public List<WebElement> popUpClose() {
        return findElementsByXpath("//div [@class='popup__close']");
    }

    public WebElement headerFoxtrot() {
        return findElementByXpath("//img [@alt='foxtrot']");
    }

    public WebElement headerCompare() {
        return findElementByXpath("//div [@class='header-tooltip unselectable']");
    }

    public WebElement headerFavorite() {
        return findElementByXpath("//div [@class='header-favorite']");
    }

    public WebElement headerRecieveBonus() {
        return findElementByXpath("//span [@id='bonus-container']");
    }

    public WebElement headerBigSales() {
        return findElementByXpath("//i [@class='icon icon-sales']");
    }

    public WebElement headerAllSales() {
        return findElementByXpath("//a [@class='header__categories-promo']");
    }
}

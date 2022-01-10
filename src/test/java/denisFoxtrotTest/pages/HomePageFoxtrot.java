package denisFoxtrotTest.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageFoxtrot extends BasePage {

    public HomePageFoxtrot(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch() {
        return findElementByXpath("//input[@type='search']");
    }

    public List<WebElement> findMerch() {
        return findElementsByXpath("//a[@class='card__title']");
    }

    public WebElement addToCart() {
        return findElementByXpath("//div[@class='button buy-button product-box__main-buy__button product-buy-button']");
    }

    public WebElement nextPage() {
        return findElementByXpath("//i [@class='icon icon-chevron-right']");
    }

    public WebElement checkCart() {
        return findElementByXpath("//div [@id='cartSummary']");
    }

    public List<WebElement> deleteFromCart() {
        return findElementsByXpath("//i [@class='icon icon-trash']");
    }

    public WebElement displayCart() {
        return findElementByXpath("//a [@href='/ru/cart.html']");
    }

    public WebElement adClick() {
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

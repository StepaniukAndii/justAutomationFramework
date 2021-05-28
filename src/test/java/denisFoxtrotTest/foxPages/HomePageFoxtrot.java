package denisFoxtrotTest.foxPages;

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

    public List<WebElement> addToCartList() {
        return findElementsByXpath("//div [@class='button buy-button card__buttons-row product-buy-button']");
    }

    public WebElement headerCart() {
        return findElementByXpath("//i [@class='header-basket__icon icon-shop js-toggle-tooltip']");
    }

    public WebElement cartTooltip() {
        return findElementByXpath("//i [@id='cartTooltipClose']");
    }

    public WebElement openCart() {
        return findElementByXpath("//a [@href='/ru/cart.html']");
    }

    public List<WebElement> removeInsideCart() {
        return findElementsByXpath("//a [@class='button-link shop-cart__item-nav__link remove-from-cart']");
    }

    public List<WebElement> removeFromCartTooltip() {
        return findElementsByXpath("//a [@class='button-link js-delete-product-from-basket-list']");
    }
}
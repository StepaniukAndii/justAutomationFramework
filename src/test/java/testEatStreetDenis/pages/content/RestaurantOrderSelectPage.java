package testEatStreetDenis.pages.content;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestaurantOrderSelectPage extends BasePage {
    public RestaurantOrderSelectPage(WebDriver driver) {
        super(driver);
    }

    public WebElement orderBtnIsClosed() {
        return findElementByXpath("//a [contains(@class,'btn-checkout--is-disabled')]");
    }

    public WebElement orderBtnAvailable() {
        return findElementByXpath("//a [@class='btn btn--orange btn-checkout full-width ng-binding']");
    }

    public List<WebElement> ordersSelectByPrice() {
        return findElementsByXpath("//a [contains(@class, 'food-price')]");
    }

    public List<WebElement> ordersSelectByName() {
        return findElementsByXpath("//span [contains(@class, 'menu-item-name')]");
    }

    public WebElement getQuantityNumber() {
        return findElementByXpath("//div [contains(@class,'quantity-selector--number')]");
    }

    public List<WebElement> orderNameInCart() {
        return findElementsByXpath("//td[@ng-if-start='!product.removed']//a [@tabindex='0']");
    }

    public List<WebElement> removeOrderBtn() {
        return findElementsByXpath("//a [@id='remove-item']");
    }

    public WebElement checkDeliveryMinimum() {
        return findElementByXpath("//li [@ng-if='$order.isDelivery()']//span[contains(text(), '$')]");
    }

    public WebElement totalPrice() {
        return findElementByXpath("//strong [contains(@class,'ng-binding')]");
    }

    public WebElement increaseQuantity() {
        return findElementByXpath("//button [@id='quantity--adds']");
    }

    public WebElement addToCartBtn() {
        return findElementByXpath("//a [@id='confirm-options']");
    }
}

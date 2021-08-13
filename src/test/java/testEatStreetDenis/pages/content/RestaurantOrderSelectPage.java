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

    public WebElement groupOrderBtn() {
        return findElementByXpath("//a [contains(@class,'btn--group-order')]");
    }

    public WebElement groupOrderPopUpBody() {
        return findElementByXpath("//form [contains(@ng-submit, 'esFormCtrl.submit()')]");
    }

    public WebElement groupOrderNameInput() {
        return findElementByXpath("//input [@name='groupOrderName']");
    }

    public List<WebElement> deliveryTakeoutChoose() {
        return findElementsByXpath("//div [@class='btn-group margin-bottom-10']//label[@class='ng-scope']");
    }

    public WebElement streetAddressInput() {
        return findElementByXpath("//input [@id='streetAddress']");
    }

    public WebElement splitTheBillBtn() {
        return findElementByXpath("//label [@for='group-order__btn-group-buyer--split']");
    }

    public WebElement refuseSplitTheBillBtn() {
        return findElementByXpath("//label [@for='group-order__btn-group-buyer--self']");
    }

    public WebElement confirmModalBtn() {
        return findElementByXpath("//input [@id='confirm-modal-btn']");
    }

    public WebElement cancelModalBtn() {
        return findElementByXpath("//a [@id='cancel-modal-btn']");
    }

    public WebElement groupOrderSettingsBtn() {
        return findElementByXpath("//a [contains(@class,'btn--group-order ng-scope')]");
    }

    public WebElement yourGroupOrderModalBody() {
        return findElementByXpath("//div [contains(@class,'modal-body ng-scope')]");
    }
}
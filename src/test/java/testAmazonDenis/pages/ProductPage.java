package testAmazonDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> amazonSelectProduct() {
        return findElementsByXpath("//span [contains(@class,'a-size-medium a-color-base a-text-normal')]");
    }

    public WebElement addToCartBtn() {
        return findElementByXpath("//input [@id='add-to-cart-button']");
    }

    public WebElement switchToCart() {
        return findElementByXpath("//span [@id='attach-sidesheet-view-cart-button']");
    }

    public List<WebElement> filterCheckboxes() {
        return findElementsByXpath("//div [contains(@class,'a-checkbox a-checkbox-fancy')]");
    }

    public List<WebElement> filterByCustomerReview() {
        return findElementsByXpath("//section [contains(@aria-label,'Up')]");
    }
}

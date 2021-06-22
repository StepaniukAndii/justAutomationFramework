package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> goods() {
        return findElementsByXpath("//span [@class='goods-tile__title']");
    }

    public WebElement nextGoodsPage() {
        return findElementByXpath("//a [@class='button button_color_gray button_size_medium pagination__direction pagination__direction_type_forward ng-star-inserted']");
    }

    public WebElement previousGoodsPage() {
        return findElementByXpath("//a [@class='button button_color_gray button_size_medium pagination__direction ng-star-inserted']");
    }

    public List<WebElement> addToCart() {
        return findElementsByXpath("//button [@class='buy-button goods-tile__buy-button ng-star-inserted']");
    }

    public WebElement removeAdd() {
        return findElementByXpath("//span [@class='exponea-close-cross']");
    }
}

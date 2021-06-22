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
}

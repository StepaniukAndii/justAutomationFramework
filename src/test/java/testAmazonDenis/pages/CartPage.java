package testAmazonDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public HeaderPage headerPage() {
        return new HeaderPage(driver);
    }

    public ProductPage productPage() {
        return new ProductPage(driver);
    }

    public List<WebElement> deleteProductBtn() {
        return findElementsByXpath("//input [@data-action='delete']");
    }
}

package denisFoxtrotTest.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement sortBYPopularity() {
        return findElementByXpath("//li [@data-sort-order='Popularity']");
    }

    public WebElement sortPriceDesc() {
        return findElementByXpath("//li [@data-sort-order='PriceDesc']");
    }

    public WebElement sortPriceAsc() {
        return findElementByXpath("//li [@data-sort-order='PriceAsc']");
    }

    public List<WebElement> filters() {
        return findElementsByXpath("//label [@class='brand ']");
    }
}

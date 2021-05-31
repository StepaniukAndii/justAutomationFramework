package denisFoxtrotTest.foxPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterPage extends BasePage {
    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement sortPopularity() {
        return findElementByXpath("//li [@data-sort-order='Popularity']");
    }

    public WebElement sortDesc() {
        return findElementByXpath("//li [@data-sort-order='PriceDesc']");
    }

    public WebElement sortAsc() {
        return findElementByXpath("//li [@data-sort-order='PriceAsc']");
    }

    public List<WebElement> filters() {
        return findElementsByXpath("//label [@class='brand ']");
    }
}

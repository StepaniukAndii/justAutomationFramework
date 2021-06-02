package testOLX.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchInside() {
        return findElementByXpath("//input [@id='search-text']");
    }

    public List<WebElement> offers() {
        return findElementsByXpath("//a [@data-cy='listing-ad-title']");
    }

    public WebElement path() {
        return findElementByXpath("//ol [@data-testid='breadcrumbs']");
    }

    public WebElement clearSearch() {
        return findElementByXpath("//a [@id='clearQ']");
    }

    public List<WebElement> addToFavorite() {
        return findElementsByXpath("//span [@data-icon='star']");
    }

    public WebElement addToFavoriteInside() {
        return findElementByXpath("//div [@class='css-1lx5q7o']");
    }

    public WebElement favoritesInside() {
        return findElementByXpath("//span [@data-testid='observed-counter']");
    }
}

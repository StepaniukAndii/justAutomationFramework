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

    public WebElement openSorting() {
        return findElementByXpath("//dl [@id='targetorder-select-gallery']");
    }

    public WebElement cheapestSort() {
        return findElementByXpath("//a [contains(text(), 'Самые дешевые')]");
    }

    public WebElement expensiveSort() {
        return findElementByXpath("//a [contains(text(), 'Самые дорогие')]");
    }

    public WebElement sortingList() {
        return findElementByXpath("//a [@class='topTabView link view__icon view__icon--list']");
    }

    public WebElement sortingWide() {
        return findElementByXpath("//a [@class='topTabView link view__icon view__icon--galleryWide']");
    }

    public List<WebElement> currency() {
        return findElementsByXpath("//a [@class='currency-link link']");
    }

    public WebElement searchInProduct() {
        return findElementByXpath("//label [@relname='search[description]']");
    }

    public WebElement searchWithPhotos() {
        return findElementByXpath("//label [@relname='search[photos]']");
    }

    public WebElement withDelivery() {
        return findElementByXpath("//label [@relname='search[courier]']");
    }

    public WebElement heading() {
        return findElementByXpath("//a [@id='choosecat']");
    }

    public List<WebElement> filters() {
        return findElementsByXpath("//i [@data-icon='raquo']");
    }

    public List<WebElement> filterBlocks() {
        return findElementsByXpath("//span [@class='header block']");
    }

    public List<WebElement> productStatus() {
        return findElementsByXpath("//span [@class='multichbox__icon']");
    }
}

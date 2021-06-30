package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CataloguePage extends BasePage {
    public CataloguePage(WebDriver driver) {
        super(driver);
    }

    public ProductPage productPageFunctions() {
        return new ProductPage(driver);
    }

    public List<WebElement> categories() {
        return findElementsByXpath("//a [@class='menu-categories__link']");
    }

    public List<WebElement> detailedCategories() {
        return findElementsByXpath("//a [@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']");
    }


}

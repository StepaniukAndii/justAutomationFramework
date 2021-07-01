package testRozetkaDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterPage extends BasePage {
    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public HeaderPage headerPageFunctions() {
        return new HeaderPage(driver);
    }

    public WebElement allResults() {
        return findElementByXpath("//a [@class='categories-filter__link categories-filter__link_type_first']");
    }

    public List<WebElement> filters() {  //0-5
        return findElementsByXpath("//span [@class='categories-filter__link-title ng-star-inserted']");
    }

    public WebElement reset() {
        return findElementByXpath("//button [@class='catalog-selection__link catalog-selection__link_type_reset']");
    }

    public List<WebElement> checklistsFilters() {
        return findElementsByXpath("//a [@class='checkbox-filter__link']");
    }

    public WebElement sortView() {
        return findElementByXpath("//button [@class='catalog-view__button ng-star-inserted']");
    }

    public WebElement selectSorting() {
        return findElementByXpath("//select [@class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']");
    }

    public List<WebElement> sortingOption() {
        return findElementsByXpath("//option [@class='ng-star-inserted']");
    }
}

package testEatStreetDenis.pages.content;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestaurantsPage extends BasePage {
    public RestaurantsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement restaurantsLabel() {
        return findElementByXpath("//h1 [contains(@class, 'restaurants-list_header')]");
    }

    public WebElement selectSortingType() {
        return findElementByXpath("//button [@aria-label='Select sort by option']");
    }

    public List<WebElement> getSortingType() {
        return findElementsByXpath("//button [contains(@class, 'dropdown_content')]");
    }

    public List<WebElement> comparingByRating() {
        return findElementsByXpath("//li [@id='ESRating']");
    }

    public List<WebElement> restaurantName() { //comparing by Name
        return findElementsByXpath("//a [contains(@class, 'restaurant-header')]");
    }

    public List<WebElement> comparingByDistance() {
        return findElementsByXpath("//span [contains(@class, 'delivery-item-info ng-binding')]");
    }

    public List<WebElement> filtersCheckboxes() {
        return findElementsByXpath("//div [contains(@class, 'checkbox checkbox_blue')]");
    }
}

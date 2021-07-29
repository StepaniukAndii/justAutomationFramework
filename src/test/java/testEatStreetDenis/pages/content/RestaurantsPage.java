package testEatStreetDenis.pages.content;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantsPage extends BasePage {
    public RestaurantsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement restaurantsLabel() {
        return findElementByXpath("//h1 [@class='restaurants-list_header ng-binding ng-scope']");
    }
}

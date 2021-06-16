package testOLX.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavoritePage extends BasePage {
    public FavoritePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> removeFromFavorite() {
        return findElementsByXpath("//span [@data-icon='star-filled']");
    }

    public WebElement clearAllFavorites() {
        return findElementByXpath("//a [@id='clearAllObserved']");
    }
}

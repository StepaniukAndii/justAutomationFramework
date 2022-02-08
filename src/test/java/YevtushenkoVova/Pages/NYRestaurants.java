package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NYRestaurants extends BasePage {
    public NYRestaurants(WebDriver driver){
        super(driver);
    }
    public WebElement activeFilterBBQ(){
        return findElement("//span[text()='BBQ']");
    }
    public WebElement activeFreeDeliveryFilter(){
        return findElement("//span[@class=\"active_filter ng-binding ng-scope\"]");
    }
    public WebElement freeDeliveryFilter(){
        return findElement("//label[@for=\"filter-Free Delivery\"]");
    }
    public WebElement bombaysRest(){
        return findElement("//a[@href=\"/new-york-city-ny/restaurants/greenstar-foods\"]");
    }
    public List<WebElement> dishPapdiChaat(){
        return driver.findElements(By.xpath("//span[@class=\"restaurant-description ng-binding\"]"));
    }
    public WebElement btnPlus(){
        return findElement("//button[@ng-class=\"{'quantity-selector--btn--disabled': (1 >= product.qty)}\"]");
    }
    public WebElement btnAddToCart(){
        return findElement("//a[@id=\"confirm-options\"]");
    }
    public WebElement btnOrder(){
        return findElement("//a[@id=\"click-checkout\"]");
    }
    public WebElement restSushi21(){
        return findElement("//a[@href=\"/new-york-city-ny/restaurants/sushi-21\"]");
    }
    public List<WebElement> gyoza(){
        return driver.findElements(By.xpath("//div[@class=\"is-clickable product-container\"]"));
    }
    public WebElement xBoxFried(){
        return findElement("//input[@id=\"16276687\"]");
    }
    public WebElement xBoxPorc(){
        return findElement("//input[@id=\"16276689\"]");
    }
}

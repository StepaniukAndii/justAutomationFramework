package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement dishPapdiChaat(){
        return findElement("//span[contains(text(),'Papdi Chaat')]");
    }
    public WebElement btnPlus(){
        return findElement("//button[@ng-class=\"{'quantity-selector--btn--disabled': (1 >= product.qty)}\"]");
    }
    public WebElement btnAddToCart(){
        return findElement("//a[@id=\"confirm-options\"]");
    }
}

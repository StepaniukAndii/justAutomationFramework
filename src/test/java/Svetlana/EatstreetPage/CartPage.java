package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver){
        super(driver);
    }
    public WebElement pressAddToCart(){
        return findElement("//span[contains(text(), 'Add to Cart')]");
    }
    public WebElement clickChekout(){
        return findElement("//a[@id='click-checkout']");
    }
    public WebElement checkValidationOrderDetails(){
        return findElement("//div[@class='widget-header widget-header--checkout']");
    }
}

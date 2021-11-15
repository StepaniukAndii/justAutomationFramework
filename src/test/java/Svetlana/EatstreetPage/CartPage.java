package Svetlana.EatstreetPage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement pressAddToCart() {
        return findElement("//div[@class='widget-footer']//a[@class='btn btn--orange float-right']");
    }
    public WebElement clickChekout() {
        return findElement("//a[@id='click-checkout']");
    }

    public WebElement checkValidationOrderDetails() {
        return findElement("//div[@class='widget-header widget-header--checkout']");
    }
    public WebElement checkCart (){
        return findElementByXpath("//span[@class='navbar__cart-count ng-binding ng-scope']");
    }
    public WebElement checkOrderAmount(){
        return findElementByXpath("//div[@class='alert alert-error margin-bottom-10 ng-binding ng-scope']");
    }
}
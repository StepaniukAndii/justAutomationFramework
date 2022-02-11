package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloSale extends BasePage {
    public AlloSale(WebDriver driver){super(driver);}
    public WebElement btnPresent(){
        return findElement("//a[@href=\"https://allo.ua/ua/events-and-discounts/type-1/\"]");
    }
//    public WebElement btnFilter(){
//        return findElement("//span[contains(text(),'Фільтри')]");
//    }
    public WebElement btnFilter(){
        return findElement("//button[@class=\"filters-btn\"]");
    }
}

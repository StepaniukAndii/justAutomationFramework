package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderOptionsPage extends BasePage {
    public OrderOptionsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addItemBtn(){
        return findElement("//button[contains(@id,'quantity')]");
    }

    public List<WebElement> addToCartBtnText(){
        return findElementsByXpath("//span[contains(@class,'ng-scope')]");
    }
}

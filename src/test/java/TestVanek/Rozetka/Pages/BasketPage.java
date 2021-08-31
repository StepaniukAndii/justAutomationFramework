package TestVanek.Rozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver){super(driver);}

    public WebElement productTitle(){
        return findElementByXpath("//a[contains(@class,'product__title')]");
    }
}

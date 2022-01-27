package TestYurchik.LoraShen.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPageLoraShen extends BasePage {
    public CartPageLoraShen(WebDriver driver){super(driver);}

    public WebElement deleteZeroElement(){ return findElementByXpath("//a[@data-marker = '#id_items-0']"); }
    public List<WebElement> checkCartEmpty() { return findElementsByXpath("//div[@class = 'cart-slot__empty']"); }
}

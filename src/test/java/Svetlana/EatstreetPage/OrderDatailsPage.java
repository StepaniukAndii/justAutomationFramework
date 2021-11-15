package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderDatailsPage extends BasePage {

    public OrderDatailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkOrderDatails(){
        return findElementByXpath("//div[@id='details-header']");
    }
}

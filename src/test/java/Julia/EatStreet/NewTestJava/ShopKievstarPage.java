package Julia.EatStreet.NewTestJava;

import ClasesToAllUs.BasePage;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopKievstarPage extends BasePage {

    public ShopKievstarPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> clickLinkPhone() {
        return findElementsByXpath("//li[@data-url-slide='/ua/phones']");
    }

}

package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderDatailsPage extends BasePage {

    public OrderDatailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkOrderDatails(){
        return findElementByXpath("//div[@id='details-header']");
    }
    public WebElement enterFirtName(){
        return findElementByXpath("//body[@class='ng-scope hide-google-recaptcha-v3']");
    }
    public WebElement enterLastName(){
        return findElementByXpath("//div[@name='lastName']");
    }
    public WebElement enterPhoneNumber(){
        return findElementByXpath("//div[@class='col-3-of-8 validation-block ng-isolate-scope']");
    }
}

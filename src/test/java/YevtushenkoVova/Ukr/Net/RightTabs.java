package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RightTabs extends BasePage {
    public RightTabs(WebDriver driver){super(driver);}
    public WebElement tapFuel(){
        return findElement("//li[@data-tab=\"fuel\"]");
    }
    public WebElement pricePump(){
        return findElement("//div[@class=\"price-pump\"]");
    }
    public WebElement tabCurrency(){
        return findElement("//li[@data-tab=\"currency\"]");
    }
    public WebElement tabAfisha(){
        return findElement("//li[@data-tab=\"afisha\"]");
    }
    public WebElement lvov(){return findElement("//a[@id='13']");}
    public WebElement cityTap(){return findElement("//div[@id=\"fuel\"]//span[@class=\"act-region\"]");}
    public WebElement lvovAssert(){return findElement("//span[text()='Львів']");}

}

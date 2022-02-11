package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftTabs extends BasePage {

    public LeftTabs(WebDriver driver){super(driver);}
    public WebElement linkSinopyik(){
        return findElement("//a[@href=\"https://ua.sinoptik.ua/\"]");
    }
    public WebElement inputOnSinoptik(){
        return findElement("//input[@id=\"search_city\"]");
    }
}

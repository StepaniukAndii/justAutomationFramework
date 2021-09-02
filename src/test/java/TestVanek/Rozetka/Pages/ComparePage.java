package TestVanek.Rozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComparePage extends BasePage {
    public ComparePage(WebDriver driver){super(driver);}

    public WebElement compareLink(){
        return findElementByXpath("//a[contains(@class,'comparison')]");
    }
    public List<WebElement> goodsTitles(){
        return findElementsByXpath("//a[contains(@class,'product')]");
    }
}

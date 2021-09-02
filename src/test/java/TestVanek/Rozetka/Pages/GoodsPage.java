package TestVanek.Rozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoodsPage extends BasePage {
    public GoodsPage(WebDriver driver){super(driver);}

    public List<WebElement> goods(){
        return findElementsByXpath("//a[contains(@class,'goods')]/img[contains(@alt,'Glenturret')]");
    }
    public List<WebElement> compareButtons(){
        return findElementsByXpath("//button[contains(@class,'compare')]");
    }
    public WebElement ageAssertBtn(){
        return findElementByXpath("//a[contains(@class,'ex')]");
    }
    public List<WebElement> goodsTitles(){
        return findElementsByXpath("//span[contains(@class,'goods-tile__title')]");
    }
}

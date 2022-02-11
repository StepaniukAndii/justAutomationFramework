package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestorauntsPage extends BasePage{
    public RestorauntsPage(WebDriver driver){super( driver);}

    public WebElement ratingbtn(){return findElementByXpath("//label[contains(@for,'filter-Rating')]");}
    public WebElement italianfoodselect(){return findElementByXpath("//label[contains(@class,'checkbox-input')][contains(@for,'filter-cuisine-Italian')]");}
    public WebElement pizzacompanyhref(){return findElementByXpath("//a[contains(@href,'pizza-company')]");}

}

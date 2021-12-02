package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CuisinePage extends BasePage {

    public CuisinePage (WebDriver driver){
        super (driver);
    }
    public WebElement openRestaurants(){
        return findElementByXpath("//a[@class='btn btn-primary margin-top-25 ng-binding']");
    }
}

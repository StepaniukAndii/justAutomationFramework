package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RestaurantsPage extends BasePage {
    public RestaurantsPage(WebDriver driver){ super(driver); }

    public WebElement restaurantsListHeader(){
        return findElementByXpath("//h1[@class='restaurants-list_header ng-binding ng-scope']");
    }
    public WebElement sortByOptionBtn(){
        return findElementByXpath("//button[@class='custom_dropdown_button']");
    }
    public List<WebElement> sortByOptionContent(){
        return findElementsByXpath("//button[@class='custom_dropdown_content_option']");
    }
}

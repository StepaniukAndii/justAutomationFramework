package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CityRestaurantsPage extends BasePage {
    public CityRestaurantsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement cityTitle(){
        return findElementByXpath("//h1[contains(@class,'subheader')]");
    }
}

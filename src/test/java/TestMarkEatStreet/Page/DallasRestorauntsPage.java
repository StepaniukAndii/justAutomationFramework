package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import TestMarkEatStreet.Test.DallasRestorauntsEatStreetTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DallasRestorauntsPage extends BasePage{
    public DallasRestorauntsPage(WebDriver driver){super(driver);}

    public WebElement viewallfastfoodoptionsbtn(){return findElementByXpath("//*[contains(text(),'Fast Food options')]");}

}

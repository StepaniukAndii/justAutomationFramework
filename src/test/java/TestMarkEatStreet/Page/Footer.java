package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer extends BasePage{
    public Footer(WebDriver driver){super(driver);}
    public WebElement aboutusbtn(){return findElementByXpath("//a[contains(@href,'about')]");}
    public WebElement contactusbtn(){return findElementByXpath("//a[contains(@href,'contact')]");}
}

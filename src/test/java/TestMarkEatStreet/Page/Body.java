package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Body extends BasePage {
    public Body(WebDriver driver) {super(driver);
    }
    public WebElement applybtn(){return findElementByXpath("//a[contains(@class, 'how-it-works_link')][contains(@href,'/driver-careers')]");}
}

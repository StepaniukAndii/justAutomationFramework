package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends BasePage {
    public Header(WebDriver driver) {
        super(driver);
    }
    public WebElement logoBtn(){
        return findElementByXpath("//a[contains(@class,'logo')]");
    }
    public WebElement cart(){
        return findElementByXpath("//div[contains(@ng-click,'cart')]");
    }
    public WebElement cartOptionBtn(){
        return findElementByXpath("//a[contains(@class,'btn--orange')]");
    }
}

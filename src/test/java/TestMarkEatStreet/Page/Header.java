package TestMarkEatStreet.Page;

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
    public WebElement partnerBtn(){return findElementByXpath("//a[contains(@class, 'partners')]");}
    public WebElement signinbtn(){return findElementByXpath("//a[contains(@class,'btn btn-sign')]");}

}
package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Body extends BasePage {
    public Body(WebDriver driver) {super(driver);
    }
    public WebElement applybtn(){return findElementByXpath("//a[contains(@class, 'how-it-works_link')][contains(@href,'/driver-careers')]");}
    public WebElement deliveybtn(){return findElementByXpath("//label[contains(@for,'delivery')]");}
    public WebElement enteryouraddressinput(){return findElementByXpath("//input[contains(@class,'enter')]");}
    public WebElement getfedbtn(){return findElementByXpath("//a[contains(@id,'find')]");}
}

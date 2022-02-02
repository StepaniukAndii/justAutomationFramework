package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverPage extends BasePage {
    public DriverPage (WebDriver driver) {
        super(driver);
    }

    public WebElement applyinyourcitybtn() {
        return findElementByXpath("//select[contains(@onchange, 'location = this.value;')]");}
    public WebElement deliverydriveramesbtn(){return findElementByXpath("//*[contains(text(),'Ames')]");}
    public WebElement enteryouraddressbtn(){return findElementByXpath("//input[contains(@id, 'address')]");}
    public WebElement restorauntorfoodbtn(){return findElementByXpath("//input[contains(@id, 'search-autocomplete')]");}
    public WebElement gotitbtn(){return findElementByXpath("//*[contains(text(),'Got it')]");}
}

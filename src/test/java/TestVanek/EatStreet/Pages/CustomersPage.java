package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomersPage extends BasePage {
    public CustomersPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getToKnowImg(){
        return findElementByXpath("//div[contains(text(),'Get')]");
    }
    public WebElement faqImg(){
        return findElementByXpath("//div[contains(text(),'FAQ')]");
    }
    public WebElement accountImg(){
        return findElementByXpath("//div[contains(text(),'Account')]");
    }
    public WebElement paymentImg(){
        return findElementByXpath("//div[contains(text(),'Payment')]");
    }
}

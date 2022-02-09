package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver){super(driver);}
    public WebElement myaccountbtn(){return findElementByXpath("//a[contains(@id,'menu')]");}
    public WebElement edityourinfobtn(){return findElementByXpath("//a[contains(@id,'edit-info')]");}
    public WebElement firstnameinfoinput(){return findElementByXpath("//input[contains(@id,'first')]");}
    public WebElement lastnameinfoinput(){return findElementByXpath("//input[contains(@id,'last')]");}
    public WebElement phonenumberinfoinput(){return findElementByXpath("//input[contains(@id,'phone')]");}
    public WebElement settingsdroplist(){return findElementByXpath("//ng-button[contains(@class,'btn')]");}
    public WebElement checkboxrestaurantnotes(){return findElementByXpath("//label[contains(@for,'show')]");}
    public WebElement saveeditinfo(){return findElementByXpath("//input[contains(@id,'confirm')]");}
}

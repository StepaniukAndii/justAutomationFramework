package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public WebElement changepasswordbtn(){return findElementByXpath("//a[contains(@id,'change')]");}
    public WebElement curentpasswordinput(){return findElementByXpath("//input[contains(@id,'current')]");}
    public WebElement newpasswordinput(){return findElementByXpath("//input[contains(@id,'newPassword')]");}
    public WebElement newpasswordinputconfirm(){return findElementByXpath("//input[contains(@id,'newPasswordCon')]");}
    public WebElement updatepasswordbtn(){return findElementByXpath("//input[contains(@id,'confirm')]");}
    public WebElement signoutbtn(){return findElementByXpath("//a[contains(@id,'signout')]");}
    public WebElement deleteaccountbtn(){return findElementByXpath("//a[contains(@ng-if,'$user.getUser().email')]");}
    public WebElement yestodeleteaccbtn(){return findElementByXpath("//a[contains(@id,'confirm')]");}
    public WebElement confirmtodeleteaccbtn(){return findElementByXpath("//a[contains(@id,'confirm-modal')]");}
    public WebElement textareawhydeleteacc(){return findElementByXpath("//textarea[contains(@name,'reason')]");}
    public WebElement submittodeleteaccbtn(){return findElementByXpath("//button[contains(@id,'reset')]");}
}

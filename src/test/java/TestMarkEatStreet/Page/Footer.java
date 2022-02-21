package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer extends BasePage{
    public Footer(WebDriver driver){super(driver);}
    public WebElement aboutusbtn(){return findElementByXpath("//a[contains(@href,'about')]");}
    public WebElement contactusbtn(){return findElementByXpath("//a[contains(@href,'contact')]");}
    public WebElement careersbtn(){return findElementByXpath("//a[contains(text(),'Careers')]");}
    public WebElement techjobsbtn(){return findElementByXpath("//label[contains(text(),'Tech')]");}
    public WebElement productanalysstbtn(){return findElementByXpath("//span[contains(text(),'Product')]");}
    public WebElement blogbtn(){return findElementByXpath("//a[contains(@href,'blog')]");}
    public WebElement forcustomersbtn(){return findElementByXpath("//*[contains(text(),'For Cust')]");}
    public WebElement accessibilitystatementbtn(){return findElementByXpath("//a[contains(text(),'Acces')]");}
    public WebElement restorauntsdashboardbtn(){return findElementByXpath("//a[contains(text(),'Restaurant Dashboard')]");}
    public WebElement privacypolicybtn(){return findElementByXpath("//a[contains(text(),'Privacy')]");}
    public WebElement termsofusebtn(){return findElementByXpath("//a[contains(text(),'Terms of Use')]");}
    public WebElement restoraunttermsbtn(){return findElementByXpath("//a[contains(text(),'Restaurant Terms')]");}
    public WebElement googleplaybtn(){return findElementByXpath("//a[contains(@class,'app-btn-android')]");}
    public WebElement appstorebtn(){return findElementByXpath("//a[contains(@class,'app-btn-iphone')]");}
    public WebElement facebookbtn(){return findElementByXpath("//a[contains(@href,'https://www.facebook')]");}
}

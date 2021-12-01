package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactSupportPage extends BasePage {
    public ContactSupportPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> inputs(){
        return findElementsByXpath("//input");
    }
    public List<WebElement> helpTextAlert(){
        return findElementsByXpath("//div[contains(@id,'help')]");
    }
    public WebElement answers(){
        return findElementByXpath("//a[contains(@class,'slds') and contains(@href,'I-cancel')]/parent::*");
    }
    public WebElement answerHeaderText(){
        return findElementByXpath("//h1[contains(@class,'article-head')]");
    }
    public WebElement headerMore(){
        return findElementByXpath("//button[contains(text(),'More')]");
    }
    public WebElement headerFind(){
        return findElementByXpath("//button[contains(text(),'Find')]");
    }
    public WebElement headerMoreSubMenu(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Contact Us')]");
    }
    public WebElement headerMoreSubFindGet(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Get')]");
    }
    public WebElement headerMoreSubFindFAQs(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'FAQ')]");
    }
    public WebElement headerMoreSubFindAccount(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Account')]");
    }
    public WebElement headerMoreSubFindOrder(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Order')]");
    }
    public WebElement headerMoreSubFindPayment(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Payment')]");
    }
    public WebElement headerMoreSubFindCoupon(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Coupon')]");
    }
    public WebElement headerHome(){
        return findElementByXpath("//a[contains(text(),'Home')]");
    }
    public WebElement contentTitle(){
        return findElementByXpath("//h2[contains(@class,'content')]");
    }
    public WebElement headerGetFed(){
        return findElementByXpath("//a[contains(text(),'Get Fed')]");
    }
}

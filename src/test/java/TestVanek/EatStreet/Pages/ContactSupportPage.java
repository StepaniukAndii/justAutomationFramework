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
    public WebElement headerMoreSubFind(){
        return findElementByXpath("//div[contains(@class,'subMenu')]/div[contains(@class,'top-left')]/ul/li/a[contains(text(),'Get')]");
    }
}

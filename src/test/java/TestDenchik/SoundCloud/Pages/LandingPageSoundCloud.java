package TestDenchik.SoundCloud.Pages;

import ClasesToAllUs.BasePage;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LandingPageSoundCloud extends BasePage {


    public LandingPageSoundCloud(WebDriver driver) {
        super(driver);
    }
    public WebElement streamButton(){
        return findElementByXpath("//a[contains(@href,'stream')]");
    }
    public WebElement cookies (){
        return findElementByXpath("//button[contains(@id, 'onetrust-accept-btn-handler')]");
    }
    public WebElement libraryButton(){
        return findElementByXpath("//a[contains(@href,'library')]");
    }
    public WebElement googlePlaybutton(){
        return findElementByXpath("//a[contains(@class,'googlePlay')]");
    }
    public WebElement appStorebutton(){
        return findElementByXpath("//a[contains(@class, 'appStore')]");
    }
    public WebElement uploadbutton(){
        return findElementByXpath("//span[contains(@class, 'upload')]");
    }
    public WebElement proplansbutton(){
        return findElementByXpath("//li[contains(@class, 'g-tabs-item')]/a[contains(@href, 'pro')]");
    }
}
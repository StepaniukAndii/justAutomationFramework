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
    public WebElement settingsandmoredropdownbutton(){
        return findElementByXpath("//a[contains(@class, 'header__moreButton sc-ir')]");
    }
    public WebElement aboutusbutton(){
        return findElementByXpath("//*[contains(text(), 'About us')]");
    }
    public WebElement aboutuspagefacebooklink(){
        return findElementByXpath("//a[contains(@href, 'http://www.facebook.com/soundcloud')]");
    }
    public WebElement aboutuspagetwitterlink() {
        return findElementByXpath("//a[contains(@href, 'http://twitter.com/soundcloud')]");
    }
    public WebElement aboutuspagehelpcenterbutton(){
        return findElementByXpath("//a[contains(@href, 'http://help.soundcloud.com')]");
    }
    public WebElement aboutUsPageCopyrightClaimCenterButton(){
        return findElementByXpath("//a[contains(@href, 'https://copyright.soundcloud.com/disputes')]");
    }

}
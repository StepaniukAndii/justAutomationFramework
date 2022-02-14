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
    public WebElement aboutuspagehelpcommunitybutton(){
        return findElementByXpath("//a[contains(@href, 'http://soundcloudcommunity.com')]");
    }
    public WebElement aboutUsPageReportingCopyrightInfringement(){
        return findElementByXpath("//a[contains(@href, 'https://soundcloud.com/pages/copyright/report')]");
    }
    public WebElement aboutUsPageAdvertisingOnSoundCloudButton(){
        return findElementByXpath("//a[contains(@href, 'http://advertising.soundcloud.com')]");
    }
    public WebElement aboutUsPageenquiriesbutton(){
        return findElementByXpath("//a[contains(@href, 'http://soundcloud.com/press')]");
    }
    public WebElement aboutUsPageAPIandPartnershipsButton(){
        return findElementByXpath("//a[contains(@href, 'http://developers.soundcloud.com/support')]");
    }
    public WebElement aboutUsPageLawEnforementRequestsButton(){
        return findElementByXpath("//a[contains(@href, 'https://soundcloud.com/law-enforcement-guidelines')]");
    }
    public WebElement aboutUsPageCurrentOpeningsButton(){
        return findElementByXpath("//a[contains(@href, 'http://soundcloud.com/jobs')]");
    }
    public WebElement legalButton(){
        return findElementByXpath("//ul[contains(@class, 'headerMenu__list sc-list-nostyle')]//a[contains(@href, '/terms-of-use')]");
    }
    public WebElement dropDownListCopyrightButton(){
        return findElementByXpath("//ul[contains(@class, 'headerMenu__list sc-list-nostyle')]//a[contains(@href, 'pages/copyright')]");
    }
    public WebElement copyrightPageFurtherResourcesSectionFirstLinkSoundCloud(){
        return findElementByXpath("//a[contains(@href, 'http://www.wipo.int/directory/en/urls.jsp')]");
    }
    public WebElement copyrightPageFurtherResourcesSectionSecondLinkSoundCloud(){
        return findElementByXpath("//a[contains(@href, 'http://www.wipo.int/wipolex/en/')]");
    }
    public WebElement dropDownListBlogButtonSoundCloud(){
        return findElementByXpath("//ul[contains(@class, 'headerMenu__list sc-list-nostyle')]//a[contains(@href, 'https://blog.soundcloud.com')]");
    }
}
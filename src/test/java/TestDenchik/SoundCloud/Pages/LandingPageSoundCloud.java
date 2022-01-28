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
    public WebElement libraryButton() {
        return findElementByXpath("//a[contains(@href,'library')]");
    }
}
package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ContinueWithGoogleButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void continueWithGoogleButton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.libraryButton().click();
        driver.switchTo().frame(landingPageSoundCloud.iframeSD());
        landingPageSoundCloud.continueWithGoogleButton().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(landingPageSoundCloud.soundCloudButton().isDisplayed());
    }
}

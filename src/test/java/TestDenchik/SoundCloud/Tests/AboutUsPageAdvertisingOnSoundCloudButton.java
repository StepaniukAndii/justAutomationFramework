package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsPageAdvertisingOnSoundCloudButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutUsPageAdvertisingOnSoundCloudButton(){
        driver.get("https://soundcloud.com/pages/contact");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.aboutUsPageAdvertisingOnSoundCloudButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("advertising"));
    }
}

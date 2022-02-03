package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Uploadbutton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void uploadbutton() {
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.uploadbutton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("upload"));
    }
}
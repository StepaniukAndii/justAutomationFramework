package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Streambutton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void streambutton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.streamButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("stream"));
    }
}
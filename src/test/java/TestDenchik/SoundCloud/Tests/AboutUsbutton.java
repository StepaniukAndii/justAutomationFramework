package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsbutton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutusbutton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.settingsandmoredropdownbutton().click();
        landingPageSoundCloud.aboutusbutton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/pages/contact"));
    }
}

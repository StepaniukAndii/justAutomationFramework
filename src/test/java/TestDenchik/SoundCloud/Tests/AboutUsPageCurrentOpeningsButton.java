package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsPageCurrentOpeningsButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutuspagefacebooklink(){
        driver.get("https://soundcloud.com/pages/contact");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.aboutUsPageCurrentOpeningsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("careers"));
    }
}

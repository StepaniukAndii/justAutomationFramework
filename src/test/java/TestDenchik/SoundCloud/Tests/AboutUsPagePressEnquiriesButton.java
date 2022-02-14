package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsPagePressEnquiriesButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutuspageenquiriesbutton(){
        driver.get("https://soundcloud.com/pages/contact");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.aboutUsPageenquiriesbutton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("press"));
    }
}


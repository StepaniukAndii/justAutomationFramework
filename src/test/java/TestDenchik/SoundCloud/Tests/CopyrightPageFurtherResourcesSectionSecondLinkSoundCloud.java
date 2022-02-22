package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyrightPageFurtherResourcesSectionSecondLinkSoundCloud extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void copyrightPageFurtherResourcesSectionSecondLinkSoundCloud(){
        driver.get("https://soundcloud.com/pages/copyright#what-is-copyright");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.copyrightPageFurtherResourcesSectionSecondLinkSoundCloud().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("wipolex"));
    }
}

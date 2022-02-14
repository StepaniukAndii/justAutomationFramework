package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyrightPageFurtherResourcesSectionFirstLinkSoundCloud extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutuspageenquiriesbutton(){
        driver.get("https://soundcloud.com/pages/copyright#what-is-copyright");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.copyrightPageFurtherResourcesSectionFirstLinkSoundCloud().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("directory"));
    }
}

package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsPageReportingCopyrightInfringement extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void aboutUsPageReportingCopyrightInfringement(){
        driver.get("https://soundcloud.com/pages/contact");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.aboutUsPageReportingCopyrightInfringement().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/copyright/report"));
    }
}

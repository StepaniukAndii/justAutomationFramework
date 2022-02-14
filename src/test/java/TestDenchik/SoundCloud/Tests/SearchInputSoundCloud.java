package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInputSoundCloud extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void searchInputSoundCloud(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.searchInputSoundCloud().sendKeys("Trap");
        landingPageSoundCloud.searchButtonMusic().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Trap"));
    }
}

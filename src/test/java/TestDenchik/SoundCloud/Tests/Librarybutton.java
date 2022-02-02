package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Librarybutton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void librarybutton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.libraryButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("library"));
    }
}
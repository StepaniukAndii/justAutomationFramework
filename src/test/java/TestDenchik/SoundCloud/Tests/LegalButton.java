package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LegalButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void legalButton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.settingsandmoredropdownbutton().click();
        landingPageSoundCloud.legalButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("terms-of-use"));
    }
}

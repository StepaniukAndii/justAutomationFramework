package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownListCopyrightButton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void dropDownListCopyrightButton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.settingsandmoredropdownbutton().click();
        landingPageSoundCloud.dropDownListCopyrightButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("copyright"));
    }
}

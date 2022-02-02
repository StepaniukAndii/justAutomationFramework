package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ProPlansbutton extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void proplansbutton() {
        driver.get("https://soundcloud.com/upload");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.proplansbutton().click();
        ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("pro"));
    }
}
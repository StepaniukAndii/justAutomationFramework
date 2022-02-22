package TestDenchik.SoundCloud.Tests;

import ClasesToAllUs.TestInit;
import TestDenchik.SoundCloud.Pages.LandingPageSoundCloud;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DropDownListBlogButtonSoundCloud extends TestInit {
    LandingPageSoundCloud landingPageSoundCloud;
    @Test
    public void dropDownListBlogButton(){
        driver.get("https://soundcloud.com/discover");
        landingPageSoundCloud = new LandingPageSoundCloud(driver);
        landingPageSoundCloud.cookies().click();
        landingPageSoundCloud.settingsandmoredropdownbutton().click();
        landingPageSoundCloud.dropDownListBlogButtonSoundCloud().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("blog"));
    }
}

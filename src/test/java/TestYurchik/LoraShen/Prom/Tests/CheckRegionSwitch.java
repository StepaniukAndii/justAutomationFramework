package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRegionSwitch extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void changeRegion() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.regionChooseProm().click();
        landingPageProm.searchTownRegionProm().sendKeys("Київ");
        Assert.assertTrue(landingPageProm.checkRealRegionChange().size() > 0);
    }
}

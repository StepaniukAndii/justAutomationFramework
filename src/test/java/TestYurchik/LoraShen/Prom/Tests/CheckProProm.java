package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckProProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void proPromchik() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.proProm().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
    }
}

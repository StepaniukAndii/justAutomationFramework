package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLoversPresentsProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void specialForYou() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.vlubleniyePodarkiProm().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("id=ua.prom"));
    }
}

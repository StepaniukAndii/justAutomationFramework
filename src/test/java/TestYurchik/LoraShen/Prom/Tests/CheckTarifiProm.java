package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTarifiProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void tarifProm() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.tarifiPromPage().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("order"));
    }
}

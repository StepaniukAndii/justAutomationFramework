package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUgodaKor extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void ugodaKorProm() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.ugodaKorystuvacha().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("terms"));
    }
}

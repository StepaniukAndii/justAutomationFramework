package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDlyaProdavca extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void dlyaProdavca() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.cheprodavcidlya().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("support"));
    }
}

package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHowToStartProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void howToStart() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.howToStart().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("join-now"));
    }
}

package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleChecksProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void multipleChecks() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.firstTovarofMultipls().sendKeys("Кросівки Nike");
        landingPageProm.secondTovarofMultipls().sendKeys("Футболка");
        landingPageProm.confirmMultipleProm().click();
        Assert.assertTrue(landingPageProm.checkLabelNikeTshirt().size() > 0);
    }
}

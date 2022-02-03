package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNeoCubeProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void checkSearchNeoCube() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.mainSearchInputProm().sendKeys("Неокуб");
        landingPageProm.mainSearchButtonProm().click();
        Assert.assertTrue(landingPageProm.checkNeocubeCaptionProm().size() > 0);
    }
}

package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CheckPromToRussian extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void multipleChecks() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.checkRULangProm().click();
        Assert.assertTrue(landingPageProm.checkActualRuProm().size() > 0);
    }
}

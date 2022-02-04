package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CheckUALanguageProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void checkUAProm() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.checkUALangProm().click();
        Assert.assertTrue(landingPageProm.checkActualUAProm().size() > 0);
    }
}

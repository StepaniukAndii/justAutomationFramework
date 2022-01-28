package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBucketColorLoraShen extends TestInit {

    LandingPageLoraShen landingPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;

    @Test
    public void CheckBucketLoraShen() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.filterBar().click();
        getElement("//label[@for = 'id_862']");
        troyandiPageLoraShen.filterColorTag().click();
        troyandiPageLoraShen.filterAcceptButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/?osnovnoj-czvet=862"));
    }
}

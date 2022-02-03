package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBucketSizeFilterLoraShen extends TestInit {

    LandingPageLoraShen landingPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;

    @Test
    public void checkBucketLoraShen() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.filterBar().click();
        getElement("//label[@for = 'id_987']");
        troyandiPageLoraShen.filterSizeTag().click();
        troyandiPageLoraShen.filterAcceptButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/?rasmer-buketa=987"));
    }
}

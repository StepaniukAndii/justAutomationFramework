package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBuketTypeLoraShen extends TestInit {

    TroyandiPageLoraShen troyandiPageLoraShen;
    LandingPageLoraShen landingPageLoraShen;

    @Test
    public void CheckBuketType() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.filterBar().click();
        getElement("//label[@for = 'id_983']");
        troyandiPageLoraShen.filterBuketTag().click();
        troyandiPageLoraShen.filterAcceptButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/?tip-buketa=983"));
    }

}

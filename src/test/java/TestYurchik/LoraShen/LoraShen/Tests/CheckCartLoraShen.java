package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.CartPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;

public class CheckCartLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;
    CartPageLoraShen cartPageLoraShen;

    @Test
    public void checkCartAfterDelete() {
        driver.get("https://lorashen.ua/shop");
        cartPageLoraShen = new CartPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.troyandiZakaz().click();
        cartPageLoraShen.deleteZeroElement().click();
        Assert.assertTrue(cartPageLoraShen.checkCartEmpty().size() > 0);
    }
}

package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.CartPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNoPhoneLoraShenCart extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    CartPageLoraShen cartPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;
    @Test
    public void checkNoPhoneLora() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        cartPageLoraShen = new CartPageLoraShen(driver);
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.troyandiZakaz().click();
        cartPageLoraShen.cartNameLine().sendKeys("Flex");
        cartPageLoraShen.cartEmailLine().sendKeys("flex9113@gmail.com");
        cartPageLoraShen.cartMobilePhone().sendKeys("");
        cartPageLoraShen.cartMeBuyerCheckBox().click();
        cartPageLoraShen.cartSelectTime().click();
        cartPageLoraShen.cartSelectAdress().click();
        cartPageLoraShen.cartCompleteOrder().click();
        Assert.assertTrue(cartPageLoraShen.checkCartEmailInvalid().size() > 0);
    }
}

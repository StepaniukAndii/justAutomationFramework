package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.CartPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNoPhoneDeliveredLoraShen extends TestInit {
    TroyandiPageLoraShen troyandiPageLoraShen;
    LandingPageLoraShen landingPageLoraShen;
    CartPageLoraShen cartPageLoraShen;
    @Test
    public void checkNoPhoneDelivered() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        cartPageLoraShen = new CartPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.troyandiZakaz().click();
        cartPageLoraShen.cartNameLine().sendKeys("Flex");
        cartPageLoraShen.cartEmailLine().sendKeys("shopogolik@gmail.com");
        cartPageLoraShen.cartMobilePhone().sendKeys("+380323232323");
        cartPageLoraShen.cartPhoneOfDelivered().click();
        cartPageLoraShen.cartNameOfDelivered().sendKeys("FlexLord");
        cartPageLoraShen.cartSelectTime().click();
        cartPageLoraShen.cartSelectAdress().click();
        cartPageLoraShen.cartCompleteOrder().click();
        Assert.assertTrue(cartPageLoraShen.checkNameDeliveredError().size() > 0);
    }
}

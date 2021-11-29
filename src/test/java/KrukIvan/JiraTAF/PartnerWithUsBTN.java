package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnerWithUsBTN extends TestInit {
    @Test
    public void checkBTNPartnerWithUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.partnerWithUsBTN().click();
        Assert.assertTrue(homePage.assertBTNPartnerWithUs().isEnabled());

    }
}

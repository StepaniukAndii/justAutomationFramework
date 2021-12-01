package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomerHeaderFindCoupon extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomerHeaderFindCoupon(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s");
        contactSupportPage.headerFind().click();
        contactSupportPage.headerMoreSubFindCoupon().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("coupon"));
    }
}

package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderFindGet extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderFindGet(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s");
        contactSupportPage.headerFind().click();
        contactSupportPage.headerMoreSubFindGet().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://eatst.force.com/customers/s/topic/0TO2K000000fyBMWAY/get-to-know-us");
    }
}

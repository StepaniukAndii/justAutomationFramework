package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderFindAccount extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderFindAccount(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s");
        contactSupportPage.headerFind().click();
        contactSupportPage.headerMoreSubFindAccount().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("account"));
    }
}

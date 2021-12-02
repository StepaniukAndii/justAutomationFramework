package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderMore extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderMore(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/contactsupport");
        contactSupportPage.headerMore().click();
        Assert.assertTrue(contactSupportPage.headerMoreSubMenu().isDisplayed());
    }
}

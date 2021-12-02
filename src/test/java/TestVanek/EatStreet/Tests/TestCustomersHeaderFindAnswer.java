package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderFindAnswer extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderFindAnswer(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/contactsupport");
        contactSupportPage.headerFind().click();
        Assert.assertTrue(contactSupportPage.headerMoreSubFindGet().isDisplayed());
    }
}

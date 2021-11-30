package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderHome extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderHome(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/contactsupport");
        contactSupportPage.headerHome().click();
        sleep(2);
        contactSupportPage.headerHome().click();
        Assert.assertTrue(contactSupportPage.contentTitle().getText().contains("Hungry. Happy. EatStreet."));
    }
}

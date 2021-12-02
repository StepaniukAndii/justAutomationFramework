package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersHeaderFindPayment extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersHeaderFindPayment(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s");
        contactSupportPage.headerFind().click();
        contactSupportPage.headerMoreSubFindPayment().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("payment"));
    }
}

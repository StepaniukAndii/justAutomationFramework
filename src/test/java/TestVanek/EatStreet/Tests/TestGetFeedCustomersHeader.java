package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGetFeedCustomersHeader extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testGetFeedCustomersHeader(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        contactSupportPage.headerGetFed().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://eatstreet.com/");
    }
}

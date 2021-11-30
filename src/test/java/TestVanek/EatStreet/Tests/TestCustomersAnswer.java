package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersAnswer extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testCustomersAnswer(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/contactsupport");
        getElement("//a[contains(@class,'slds') and contains(@href,'I-cancel')]/parent::*");
        contactSupportPage.answers().click();
        Assert.assertTrue(contactSupportPage.answerHeaderText().getText().contains("How do I cancel my order?"));
    }
}

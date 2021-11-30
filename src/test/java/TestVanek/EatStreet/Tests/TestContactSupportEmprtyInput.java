package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.ContactSupportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactSupportEmprtyInput extends TestInit {
    ContactSupportPage contactSupportPage;
    @Test
    public void testContactSupportEmprtyInput(){
        contactSupportPage = new ContactSupportPage(driver);
        openUrl("https://eatst.force.com/customers/s/contactsupport");
        getElement("//input[contains(@id,'input-23')]");
        for(int i = 0; i <= 4; i++){
            contactSupportPage.inputs().get(i+1).click();
        }
        for(int i = 0; i < 3; i++){
            Assert.assertTrue(contactSupportPage.helpTextAlert().get(i+1).getText().contains("Complete this field."));
        }
    }
}

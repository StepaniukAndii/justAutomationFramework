package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckContacts extends TestInit {
    String numberUkrTelFromSite = "380442358555";
    @Test
    public void checkContacts (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        moveMouseToElement(ukrNetPages.toEndOfTheFirstPage());
        ukrNetPages.supportCustomer().click();
        String ukrTelNumber = ukrNetPages.ukrtelecomNumber().getText().replaceAll("[^\\d.]", ""); //this part removes all characters except integers
        Assert.assertEquals(ukrTelNumber, numberUkrTelFromSite);
        sleep(2);
    }
}

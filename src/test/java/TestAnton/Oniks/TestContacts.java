package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContacts extends TestInit {

    @Test
    public void testContacts(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.getContactsBtn().click();
        Assert.assertEquals(homePage.getContactsText().getText(), "Контакты");
    }
}
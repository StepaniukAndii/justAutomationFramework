package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeliveryAndPayment extends TestInit {

    @Test
    public void testDeliveryAndPayment(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.getDeliveryAndPaymentBtn().click();
        Assert.assertEquals(homePage.getTextOnDeliveryAndPaymentPage().getText(), "Способы доставки");
    }
}

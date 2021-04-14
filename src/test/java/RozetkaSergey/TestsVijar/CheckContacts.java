package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.VijarPages.VijarPages13_16;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckContacts extends TestInit {
    @Test
    public void chechContas(){
        VijarPages13_16 vijarPages13_16 = new VijarPages13_16(driver);
        vijarPages13_16.enterToVijar("https://viyar.ua");
        vijarPages13_16.closeForeverAbverb().click();
        vijarPages13_16.proezd().click();
        vijarPages13_16.clickOnContact().get(1).click();
        String vijarMail = vijarPages13_16.getMail().getText();
        System.out.println(vijarMail);
        Assert.assertEquals(vijarMail,"office@viyar.ua");
    }
}

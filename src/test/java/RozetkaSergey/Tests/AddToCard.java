package RozetkaSergey.Tests;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages1_4;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCard extends TestInit {
    @Test
    public void addToCard() {
        VijarPages1_4 vijarPages1_4 = new VijarPages1_4(driver);
        vijarPages1_4.enterToVijar("https://viyar.ua/");
        vijarPages1_4.closeAdverb().click();
        vijarPages1_4.clickAtToolbar().click();
        vijarPages1_4.clickToDSP().click();
        vijarPages1_4.closeAdverb().click();
        sleep(1);
        vijarPages1_4.itemForCompareOne().click();
        sleep(1);
        vijarPages1_4.itemForCompareTwo().click();
        sleep(1);
        vijarPages1_4.goToCompare().click();
        String  lang = vijarPages1_4.itemCounter().getText();
        sleep(1);
        Assert.assertEquals(lang,"2");
    }
}

package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages1_4;
import RozetkaSergey.VijarPages.VijarPages5_8;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPhoneNumbers extends TestInit {
    @Test
    public void checkPhoneNumbers () {
        VijarPages5_8 vijarPages5_8 = new VijarPages5_8(driver);
        vijarPages5_8.enterToVijar("https://viyar.ua/");
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.switchToUa().click();
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.clickToOpenFindPhonNumber().click();
        vijarPages5_8.closeAdverb().click();
        String  lang = vijarPages5_8.chosePhone().getText();
        Assert.assertEquals(lang,"+38 (044) 500-57-07");
    }
}

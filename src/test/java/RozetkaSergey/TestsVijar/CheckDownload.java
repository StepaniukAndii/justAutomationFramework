package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.VijarPages.VijarPages13_16;
import org.testng.annotations.Test;

public class CheckDownload extends TestInit {
    @Test
    public void checkDowwnload(){
        VijarPages13_16 vijarPages13_16 = new VijarPages13_16(driver);
        vijarPages13_16.enterToVijar("https://viyar.ua");
        vijarPages13_16.closeForeverAbverb().click();
        vijarPages13_16.services().click();
        vijarPages13_16.cutButton().click();
        vijarPages13_16.clickOnDownload().click();
        vijarPages13_16.xml().click();
        sleep(10);
    }
}

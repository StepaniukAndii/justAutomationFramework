package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.VijarPages.VijarPages13_16;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Check3DTour extends TestInit {
    @Test
    public void check3DTour() {
        VijarPages13_16 vijarPages13_16 = new VijarPages13_16(driver);
        vijarPages13_16.enterToVijar("https://viyar.ua");
        vijarPages13_16.closeAdverb().click();
        vijarPages13_16.goTo3Dtour().click();
        vijarPages13_16.chooseNovokonstantinovskaja().click();
        vijarPages13_16.clickOnNewTitle();
        vijarPages13_16.clickOnFirstButtonToEnter().click();
        sleep(2);
           }
}

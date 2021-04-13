package RozetkaSergey.Tests;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages1_4;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSwitching extends TestInit    {
    @Test
    public void checkSwitching (){
        VijarPages1_4 vijarPages1_4 = new VijarPages1_4(driver);
        vijarPages1_4.enterToVijar("https://viyar.ua/");
        vijarPages1_4.closeAdverb().click();
        vijarPages1_4.topBar1().click();
        sleep(1);
        vijarPages1_4.topBar2().click();
        sleep(1);
        vijarPages1_4.topBar3().click();
        sleep(1);
        vijarPages1_4.topBar4().click();
        sleep(1);
        vijarPages1_4.topBar5().click();
        sleep(1);
        vijarPages1_4.topBar6().click();
        sleep(1);
        vijarPages1_4.topBar7().click();
        sleep(1);
        vijarPages1_4.topBar8().click();
        sleep(1);
        Assert.assertEquals(vijarPages1_4.counter,8);
    }
}

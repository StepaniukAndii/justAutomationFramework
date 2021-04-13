package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages9_12;
import org.testng.annotations.Test;

public class CheckMainAdvertisement extends TestInit {
    @Test //14
    public void checkMainAdvertisement () {
        VijarPages9_12 vijarPages9_12 =new VijarPages9_12(driver);
        vijarPages9_12.enterToVijar("https://viyar.ua/");
        vijarPages9_12.closeAdverb().click();
        vijarPages9_12.clickAdvertisement().get(0).click();
        sleep(1);
        vijarPages9_12.clickAdvertisement().get(0).click();
        sleep(1);
        vijarPages9_12.clickAdvertisement().get(0).click();
        sleep(1);
        vijarPages9_12.clickAdvertisement().get(0).click();
        sleep(1);
        vijarPages9_12.clickAdvertisement().get(0).click();
        sleep(1);
    }
}

package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckContact extends TestInit {
    String stringToComp = "044 537 02 22";
    RozetkaPages5_34 rozetkaPages5_34;
    boolean myBooleon;
    @Test
    public void checkContact () {
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        isElementPresent();
        closeForeverAd();
        rozetkaPages5_34.contactButton().click();
        isElementPresent();
        closeForeverAd();
        String tel = rozetkaPages5_34.listOfTelefonNumbers().get(0).getText();
        Assert.assertEquals(stringToComp, tel);
    }

    public boolean isElementPresent(){
        try {
            rozetkaPages5_34.closeAdvertisement().isEnabled();
            return myBooleon = true;
        } catch (Exception e) {
            return myBooleon = false;
        }
    }
    public void closeForeverAd() {
        if (myBooleon) {

        }
    }
}

package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSupport extends TestInit   {
    RozetkaPages5_34 rozetkaPages5_34;
    boolean myBooleon;
    boolean being;
    @Test
    public void checkSupport (){
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        sleep(1);
        isElementPresent();
        closeForeverAd();
        rozetkaPages5_34.clickOnThreeStrips().click();
        moveMouseToElement(rozetkaPages5_34.supportButton());
        rozetkaPages5_34.supportButton().click();
        being = rozetkaPages5_34.itIsWorking().isDisplayed();
        Assert.assertEquals(true,being);
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
        if (myBooleon) { rozetkaPages5_34.closeAdvertisement().click();

        }
    }
}

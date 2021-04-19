package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwichLaunguage extends TestInit {
    String stringToComp = "Знайти";
    RozetkaPages5_34 rozetkaPages5_34;
    boolean myBooleon;
    @Test
    public void swichLaunquage (){
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        isElementPresent();
        closeForeverAd();
        rozetkaPages5_34.clickOnThreeStrips().click();
        rozetkaPages5_34.changLanguageButton().click();
        sleep(2);
        isElementPresent();
        closeForeverAd();
        String textFromButton = rozetkaPages5_34.fiendButton().getText();
        Assert.assertEquals(textFromButton,stringToComp);
        sleep(1);
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
            rozetkaPages5_34.closeAdvertisement().click();
        } else {
        }
    }
}

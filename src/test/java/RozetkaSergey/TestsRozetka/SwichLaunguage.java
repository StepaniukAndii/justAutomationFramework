package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwichLaunguage extends TestInit {
    String stringToComp = "Знайти";
    boolean myBooleon;

    @Test
    public void swichLaunquage (){
        RozetkaPages5_34  rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.getBurgerMenuButton().click();
        rozetkaPages5_34.changLanguageButton().click();
        String textFromButton = rozetkaPages5_34.fiendButton().getText();
        Assert.assertEquals(textFromButton,stringToComp);
        sleep(1);
        closeAdIfExist();
    }
}

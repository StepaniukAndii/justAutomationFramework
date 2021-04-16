package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class CheckPromotion extends TestInit {
    @Test
    public void checkPromotion (){
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.closeAdvertisement().click();
        rozetkaPages5_34.listToleft().click();
        sleep(1);
        rozetkaPages5_34.listToleft().click();
        sleep(1);
        rozetkaPages5_34.listToleft().click();
        sleep(1);
        rozetkaPages5_34.listToRight().click();
        sleep(1);
        rozetkaPages5_34.listToRight().click();
        sleep(1);
        rozetkaPages5_34.listToRight().click();
        sleep(1);
    }
}

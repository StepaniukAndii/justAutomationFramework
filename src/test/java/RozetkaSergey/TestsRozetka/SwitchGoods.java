package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class SwitchGoods extends TestInit   {
    @Test
    public void switchGoods () {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        sleep(1);

    }
}

package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckSeidMenu extends TestInit {
    @Test
    public void checkSeidMenu (){
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        Actions actions = new Actions(driver);
        rozetkaPages1_4.enterToRozetka("https://rozetka.com.ua/");
        actions.moveToElement(rozetkaPages1_4.littleTripThrowMenu().get(0));
        sleep(2);

        //rozetkaPages1_4.littleTripThrowMenu().get(1)
        sleep(1);


    }
}

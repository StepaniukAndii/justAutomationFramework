package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class LikeTest extends TestInit {
    @Test
    public void likeTest() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.clickTopMenu().click();
        rozetkaPages5_34.clickOnLaptopAndComp().click();
        sleep(1);
        rozetkaPages5_34.likeButtons().get(2).click();
        sleep(2);
    }
}

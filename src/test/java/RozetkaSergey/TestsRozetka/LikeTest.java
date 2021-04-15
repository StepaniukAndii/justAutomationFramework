package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages8_12;
import org.testng.annotations.Test;

public class LikeTest extends TestInit {
    @Test
    public void likeTest() {
        RozetkaPages8_12 rozetkaPages8_12 = new RozetkaPages8_12(driver);
        rozetkaPages8_12.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages8_12.clickTopMenu().click();
        rozetkaPages8_12.clickOnLaptopAndComp().click();
        sleep(1);
        rozetkaPages8_12.likeButtons().get(2).click();
        sleep(2);
        rozetkaPages8_12.likeButtons().get(1).click();
        sleep(2);
    }
}

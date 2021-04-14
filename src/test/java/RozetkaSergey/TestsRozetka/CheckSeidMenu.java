package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckSeidMenu extends TestInit {
    @Test
    public void checkSeidMenu() throws InterruptedException {
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        rozetkaPages1_4.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages1_4.littleTripThrowMenu();
    }
}

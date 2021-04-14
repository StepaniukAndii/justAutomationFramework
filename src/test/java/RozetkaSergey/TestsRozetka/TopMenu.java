package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages1_4;
import org.testng.annotations.Test;

public class TopMenu extends TestInit {
    @Test
    public void topMenu(){
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        rozetkaPages1_4.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages1_4.closeAdverb().click();
        rozetkaPages1_4.pickMainMenu().click();
        rozetkaPages1_4.goToMainMenu().get(0).click();
        sleep(1);
        rozetkaPages1_4.chooseComp().click();
        sleep(1);
    }
}

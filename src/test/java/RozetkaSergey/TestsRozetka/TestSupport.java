package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSupport extends TestInit {
    RozetkaPages5_34 rozetkaPages5_34;

    @Test
    public void testSupport () {
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.getBurgerMenuButton().click();
        moveMouseToElement(rozetkaPages5_34.supportButton());
        rozetkaPages5_34.supportButton().click();
        boolean being = rozetkaPages5_34.itIsWorking().isDisplayed();
        Assert.assertEquals(being,true);
        sleep(1);
    }
}

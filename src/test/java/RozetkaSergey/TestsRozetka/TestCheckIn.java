package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class TestCheckIn extends TestInit {
    RozetkaPages5_34 rozetkaPages5_34;
    String pass = "23112010Ro";
    String login = "grinred69@gmail.com";
    @Test
    public void testCheckIn () {
        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.enterIntoAccountButton().click();
        rozetkaPages5_34.setLoginField().sendKeys(login);
        rozetkaPages5_34.setPasswordField().sendKeys(pass);
        rozetkaPages5_34.clickEnter().click();
    }
}

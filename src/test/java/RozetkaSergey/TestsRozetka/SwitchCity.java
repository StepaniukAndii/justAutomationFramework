package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchCity extends TestInit {
    @Test
    public void testCity() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.closeAdvertisement().click();
        rozetkaPages5_34.clickOnThreeStrips().click();
        rozetkaPages5_34.chooseCity().click();
        String one = rozetkaPages5_34.listOfCites().get(3).getText();
        rozetkaPages5_34.listOfCites().get(3).click();
        System.out.println(one+" one City of the list");
        Assert.assertEquals(one,"Запорожье");
        sleep(1);
    }
}

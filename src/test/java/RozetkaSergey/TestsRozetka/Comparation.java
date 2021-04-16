package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class Comparation extends TestInit {
    @Test
    public void comparation (){
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.clickTopMenu().click();
        rozetkaPages5_34.clickOnLaptopAndComp().click();
        sleep(3);
        rozetkaPages5_34.addToCompare().get(0).click();
        sleep(3);
        rozetkaPages5_34.addToCompare().get(1).click();
        rozetkaPages5_34.goToComparator().get(2).click();
        rozetkaPages5_34.goWeiter().click();
        sleep(2);
    }

}

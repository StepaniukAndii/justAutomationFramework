package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages8_12;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Comparation extends TestInit {
    @Test
    public void comparation (){
        RozetkaPages8_12 rozetkaPages8_12 = new RozetkaPages8_12(driver);
        rozetkaPages8_12.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages8_12.clickTopMenu().click();
        rozetkaPages8_12.clickOnLaptopAndComp().click();
        sleep(3);
        rozetkaPages8_12.addToCompare().get(0).click();
        sleep(3);
        rozetkaPages8_12.addToCompare().get(1).click();
        rozetkaPages8_12.goToComparator().get(2).click();
        rozetkaPages8_12.goWeiter().click();
        sleep(2);
    }

}

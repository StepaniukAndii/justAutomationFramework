package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.testng.annotations.Test;

public class TestSwitchBetweenPrice extends TestInit  {
    RozetkaPages5_34 rozetkaPages5_34;
    @Test
    public void switchBetweenPrice (){

        rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        closeAdIfExist();
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        rozetkaPages5_34.selectButton().click();
        rozetkaPages5_34.selectorFromCheapToExpensive().click();
        sleep(2);
        rozetkaPages5_34.selectButton().click();
        rozetkaPages5_34.selectorFromExpensiveToCheap().click();
                sleep(1);
    }
}

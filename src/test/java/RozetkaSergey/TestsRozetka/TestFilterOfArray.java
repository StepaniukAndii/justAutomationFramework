package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestFilterOfArray extends TestInit {
    @Test

    public void filterOfArray() {
        Actions actions = new Actions(driver);
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("утюг");
        enter();
        closeAdIfExist();
        rozetkaPages5_34.buttonSmallArray().click();
        sleep(2);
        rozetkaPages5_34.buttonLargeArray().click();
        actions.moveToElement(rozetkaPages5_34.buttonMore60Goods()).perform();
        sleep(2);
        rozetkaPages5_34.buttonMore60Goods().click();
    }
}


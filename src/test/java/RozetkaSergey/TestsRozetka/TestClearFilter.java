package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClearFilter extends TestInit {
    @Test

    public void clearFilter() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        Actions actions = new Actions(driver);
        rozetkaPages5_34.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages5_34.searchField().sendKeys("пароварка");
        enter();
        closeAdIfExist();
        rozetkaPages5_34.othersSealersButton().click();
        rozetkaPages5_34.oneOfBrandButton().click();
        actions.moveToElement(rozetkaPages5_34.goToStahl()).perform();
        rozetkaPages5_34.goToStahl().click();
        rozetkaPages5_34.resetWhatWereChoose().click();
    }
}

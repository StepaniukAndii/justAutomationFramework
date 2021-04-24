package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class MultipleWindows extends TestInit {

    Locators locators;

    @Test
    public void multipleWindows(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.multipleWindows().click();
        clickOpenNewWindow();
        checkNewWindow();

    }
    private void checkNewWindow() {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        sleep (1);
        driver.switchTo().window(tabs.get(0));
        sleep (2);
    }
    private void clickOpenNewWindow() {
        locators.multipleWindowsButton().click();
    }
}
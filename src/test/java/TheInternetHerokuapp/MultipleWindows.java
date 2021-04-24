package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.testng.annotations.Test;

public class MultipleWindows extends TestInit {

    Locators locators;

    @Test
    public void multipleWindows(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.hoversTest ().click();

    }
}

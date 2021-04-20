package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.testng.annotations.Test;

public class DropdownList extends TestInit {

    Locators locators;

    @Test
    public void dropdownList(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.dropdownList().click();
        useOptionOne();
        useOptionTwo();
    }
    private void useOptionTwo() {
        locators.dropdownListSelect().click();
        locators.dropdownListOptoinTwo().click();
    }
    private void useOptionOne() {
        locators.dropdownListSelect().click();
        locators.dropdownListOptoinOne().click();
        sleep (2);
    }
}
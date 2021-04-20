package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenu extends TestInit {

    Locators locators;
    Actions action;

    @Test
    public void addRemoveElements(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.contextMenu().click();
        clickRightButtonMous();
        closeContextMenu();
    }
    private void closeContextMenu() {
        action.contextClick ();
    }
    private void clickRightButtonMous() {
        action = new Actions (driver);
        action.contextClick(locators.fildClick()).build().perform();
        sleep (2);
    }
}
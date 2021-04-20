package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends TestInit {

    Locators locators;

    @Test
    public void dragAndDrop(){
         locators = new Locators (driver);
         driver.get ("http://the-internet.herokuapp.com/");
         locators.dragAndDrop().click();
         swapElementA();

    }

    private void swapElementA() {
        WebElement draggable = locators.elementA();
        WebElement target = locators.elementB();
        new Actions(driver).dragAndDrop(draggable, target).perform();
    }
}
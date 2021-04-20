package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Checkboxes extends TestInit {

    Locators locators;

    @Test
    public void checkboxes(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.checkboxes().click();
        testClickBox();
        useList();
    }
    private void useList() {
        int numBer = locators.checkboxesList().size();
        for (int i=0;i <numBer;i++){
            List<WebElement> elements = locators.checkboxesList();
            WebElement box = elements.get (i);
                box.click ();
                sleep (1);
        }
    }
    private void testClickBox() {
        locators.checkboxesOne().click();
        sleep (1);
        locators.checkboxesTwo().click();
        sleep (1);
        locators.checkboxesOne().click();
        sleep (1);
        locators.checkboxesTwo().click();
    }
}
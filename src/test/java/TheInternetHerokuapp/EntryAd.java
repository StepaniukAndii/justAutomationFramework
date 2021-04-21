package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EntryAd extends TestInit {

    Locators locators;
    boolean windowVisible;
    WebElement button;
    WebElement clickHere;

    @Test
    public void entryAd(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.entryAd().click();
        button = locators.modalCloseWindow();
        clickHere = locators.modalClickHere();
        checkWindowVisible();
    }
    private void checkWindowVisible() {
        windowVisible = locators.modalWindow().isDisplayed();
        if(windowVisible){
            closeModalWindiw();
        }
    }
    private void closeModalWindiw() {
        sleep (1);
        button.click();
    }
}
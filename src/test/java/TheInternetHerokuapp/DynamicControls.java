package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicControls extends TestInit {

    Locators locators;
    WebElement button;
    boolean inputOffOn;

    @Test
    public void  DynamicControls(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.dynamicControls().click();
        button = locators.dynamicControlsButton();
        checkInputFild();
    }
    private void checkInputFild() {
        inputOffOn = input().isEnabled();
        if(inputOffOn){
            input().sendKeys("Тра та та");
        }if(!inputOffOn){
            activationInputFild ();
        }
    }
    private void activationInputFild() {
        button.click();
        sleep (5);
        checkInputFild ();
    }
    private WebElement input(){ return driver.findElement (By.xpath ("//form[@id='input-example']/input"));}
}
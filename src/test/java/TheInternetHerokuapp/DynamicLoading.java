package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicLoading extends TestInit {

    Locators locators;
    boolean booleanText;
    WebElement button;

    @Test
    public void dynamicLoading(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.dynamicLoading().click();
        locators.exampleOne().click();
        button = locators.exampleButton();
        checkText();
    }
    private void checkText() {
         booleanText = locators.exampleResultat().isDisplayed();
         if(!booleanText){
             buttonClick();
         }
         if(booleanText){
             WebElement element = locators.exampleResultat();
             String getText = element.getText();
             System.out.println (getText);
         }
    }
    private void buttonClick() {
        button.click ();
        sleep (5);
        checkText ();
    }
}
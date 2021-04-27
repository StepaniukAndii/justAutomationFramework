package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class AddRemoveElements extends TestInit {

    Locators locators;
    List<WebElement> listButtons = new LinkedList<>();

    @Test
    public void addRemoveElements(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.addRemoveElements().click();
        addElements();
        getNewElement();
        deleteElements();
    }

    private void getNewElement() {
          List<WebElement> elements = locators.deleteElemetns();
          for(WebElement token:elements){
              listButtons.add (token);
          }
    }
    private void deleteElements() {
        for(WebElement buttonClose:listButtons){
            buttonClose.click ();
        }
    }
    private void addElements() {
        int numBer = 5;
        for(int i=0; i < numBer; i++){
            locators.addButtonElement().click();
        }
    }
}
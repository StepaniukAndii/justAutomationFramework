package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class DynamicContent extends TestInit {

    Locators locators;
    List<String > listWords =new LinkedList<>();

    @Test
    public void dynamicContent(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.dynamicContent().click();
        clikAndGetText();
        checkText();
    }
    private void checkText() {
        for(String text:listWords){
            System.out.println (text);
        }
    }
    private void clikAndGetText() {
        int numBer = 8;
        for(int i =0; i < numBer; i++){
            WebElement element = locators.dynamicContentGetText();
            sleep (1);
            String text = element.getText();
            listWords.add (text);
            WebElement button =  locators.dynamicContentClickLink();
            button.click();
            sleep (1);
        }
    }
}
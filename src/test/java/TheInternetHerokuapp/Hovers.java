package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class Hovers extends TestInit {

    Locators locators;
    String info;
    List<String> getList;

    @Test
    public void hovers(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.hoversTest ().click();
        getList = new LinkedList ();
        getList();
        showList();
    }
    private void showList() {
        for (String word:getList){
            System.out.println (word);
            System.out.println ("-----------------");
        }
    }
    private void getList() {
        List<WebElement> list = locators.hoversList ();
        for(WebElement element:list){
            moveMouseToElement (element);
            info = element.getText();
            getList.add (info);
        }
    }
}
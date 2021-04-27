package RazooM.AlloTest.UkrNet;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class IframePalne extends TestInit {

    UkrLocators locators;
    List<String> listName;
    List<String> listPrice;

    @Test
    public void iframePalne(){
        locators = new UkrLocators(driver);
        driver.get("https://www.ukr.net/ru");
        locators.toplivo().click();
        getListName();
        getListPrice();
        showInfi();
    }
    private void showInfi() {
        System.out.println (listName + " И " + listPrice);
    }
    private void getListPrice() {
        List<WebElement> list = locators.ukrPalevoListPrice();
        listPrice = new LinkedList<> ();
        for(WebElement element: list){
            String info = element.getText();
            listPrice.add(info);
        }
    }
    private void getListName() {
        List<WebElement> list = locators.ukrPalevoListName();
        listName = new LinkedList<> ();
        for(WebElement element:list){
            String info = element.getText();
            listName.add (info);
        }
    }
}
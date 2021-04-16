package AlloTest.CheckTextTests;

import AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class SmartAndTelefonsCheckBar extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;
    List<String> lisMySections;
    List<String> getWords;
    boolean x = false;

    @Test
    public void smartAndTelefonsCheckBar(){
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.get("https://allo.ua");
        locators.smartAndTell().click();
        getSectoin();
        mySectoin();
        checkResultat();
        System.out.println (x);
    }
    private void checkResultat() {
        if(getWords.equals(lisMySections)){
            x =true;
        }else {
            x= false;
        }
    }
    private void mySectoin() {
        lisMySections = new LinkedList<> ();
        lisMySections.add("Смартфони та телефони");
        lisMySections.add("Найпопулярніше");
        lisMySections.add("Каталог");
        lisMySections.add("Виробники");
        lisMySections.add("Суміжні категорії");
    }
    private void getSectoin() {
        List<WebElement> listWeb = new LinkedList<>();
        listWeb.add (locators.vCatalog());
        listWeb.add (locators.popular());
        listWeb.add (locators.catalog());
        listWeb.add (locators.manufacture());
        listWeb.add (locators.relatedCategories());
        getWords = new LinkedList<> ();
        for(WebElement token :listWeb){
            String word = token.getText ();
            getWords.add(word);
        }
    }
}
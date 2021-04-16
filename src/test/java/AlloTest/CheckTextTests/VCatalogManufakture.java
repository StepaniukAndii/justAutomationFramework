package AlloTest.CheckTextTests;

import AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VCatalogManufakture extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;
    List<String> myURLWords;
    List<String> getURLWords;

    @Test
    public void vCatalogManufakture() {
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.get ("https://allo.ua");
        locators.smartAndTell ().click ();
        locators.manufaktureButtonAllGoods ().click ();
        getUrl ();
        myURL ();
        showGetUrl ();
        resultat ();
    }
    private void showGetUrl() {
        for (String word : getURLWords) {
            System.out.println (word);
        }
    }
    private void resultat() {
        if (myURLWords.equals (getURLWords)) {
            System.out.println ("усеее круто");
        } else {
            System.out.println ("не круто");
        }
    }
    private void myURL() {
        myURLWords = new LinkedList<> ();
        myURLWords.add ("Xiaomi");
        myURLWords.add ("Samsung");
        myURLWords.add ("Apple");
        myURLWords.add ("Poco");
    }
    private void getUrl() {
        List<WebElement> getUrl = locators.listURLManufakture ();
        getURLWords = new ArrayList<>();
        int flag = 0;
        for (WebElement token : getUrl) {
            String word = token.getText ();
            if (flag < 4) {
                getURLWords.add (word);
            } else {
                break;
            }
            flag++;
        }
    }
}
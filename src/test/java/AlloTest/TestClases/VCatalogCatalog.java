package AlloTest.TestClases;

import AlloTest.Pages.SmartAndTelefonsCheckBarLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.LinkedList;
import java.util.List;

public class VCatalogCatalog extends TestInit {

    SmartAndTelefonsCheckBarLocators locators;
    List<String> myURLWords;
    List<String> getURLWords;

    @Test
    public void vCatalogCatalog(){
        locators = new SmartAndTelefonsCheckBarLocators (driver);
        driver.get("https://allo.ua");
        locators.smartAndTell().click();
        getUrl();
        myURL();
        showGetUrl();
        resultat();
    }
    private void showGetUrl() {
        for(String word:getURLWords){
            System.out.println(word);
        }
    }
    private void resultat() {
        if(myURLWords.equals (getURLWords)){
            System.out.println("усеее круто");
        }else {
            System.out.println("не круто");
        }
    }
    private void myURL() {
        myURLWords = new LinkedList<>();
        myURLWords.add ("Смартфони і мобільні телефони");
        myURLWords.add ("Телефони для дому та офісу");
        myURLWords.add ("Аксесуари до смартфонів");
    }
    private void getUrl() {
        List<WebElement> getUrl = locators.listURLCatalog();
        getURLWords = new LinkedList<>();
        for(WebElement token:getUrl){
            String word = token.getText();
            getURLWords.add(word);
        }
    }
}
package AlloTest.TestClases;

import AlloTest.Pages.CheckingProductCatalogLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CheckingHederItems extends TestInit {

    CheckingProductCatalogLocators locators;
    List<String> listWords;
    List<String> getWords;

    @Test
    public void checkingProductCatalog(){
        locators = new CheckingProductCatalogLocators(driver);
        openUrl("https://allo.ua/ru/");
        checkMenuItems();
        listWords();
        System.out.println(getWords.containsAll(listWords));
    }
    private void checkMenuItems() {
        List<WebElement> listItems = locators.alloPrograms();
        getWords = new LinkedList<> ();
        for(WebElement token: listItems){
           String words = token.getText();
           getWords.addAll(Collections.singleton (words));
        }
    }
    private void listWords() {
        listWords = new LinkedList<>();
        listWords.add("Живи Смарт");
        listWords.add("Алло-Гроші");
        listWords.add("Алло-Апгрейд");
        listWords.add("Алло Обмен");
        listWords.add("Уценка");
        listWords.add("Акции");
    }
}

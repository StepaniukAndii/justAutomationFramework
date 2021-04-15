package AlloTest.FootersTests;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooterHelp extends TestInit {

    FooterLocators locators;
    List<String> listMyWords;
    List<String> getWords;

    @Test
    public void footerHelp(){
        locators = new FooterLocators(driver);
        driver.get("https://allo.ua");
        footerAlloHelp();
        listMyWords ();
        System.out.println(getWords.containsAll(listMyWords));
    }
    public void footerAlloHelp(){
        List<WebElement> list = locators.footerHelpList();
           getWords = new LinkedList<>();
        for(WebElement token: list){
           String words = token.getText();
           System.out.println (words);
           getWords.addAll(Collections.singleton(words));
        }
    }
    private void listMyWords() {
        listMyWords = new LinkedList<> ();
        listMyWords.add("Питання та відповіді");
        listMyWords.add("Доставка та оплата");
        listMyWords.add("Купити в кредит");
        listMyWords.add("Оплата частинами");
        listMyWords.add("Гарантія та сервісні центри");
        listMyWords.add("Статті та огляди");
        listMyWords.add("Залиште відгук про нашу роботу");
    }
}
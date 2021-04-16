package AlloTest.CheckTextTests;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FeedBackBooton extends TestInit {

    FooterLocators locators;
    String words;
    List<String> listMyWords;
    List<String> getWords;

    @Test
    public void footerFeedBack(){
        locators = new FooterLocators (driver);
        driver.get ("https://allo.ua");
        locators.feedBack().click();
        getListWords();
        myListWords();
        System.out.println ("------------");
        System.out.println(listMyWords.containsAll(getWords));
    }
    private void getListWords() {
        List<WebElement> list = locators.feedBackList();
        for(WebElement token:list){
            words = token.getText();
            System.out.println (words);
            getWords = new LinkedList<> ();
            getWords.addAll (Collections.singleton (words));
        }
    }
    private void myListWords() {
        listMyWords = new LinkedList<>();
        listMyWords.add("Подзвонити");
        listMyWords.add("Telegram");
        listMyWords.add("Viber");
        listMyWords.add("Messenger");
        listMyWords.add("aПовідомити про помилку");
    }
}
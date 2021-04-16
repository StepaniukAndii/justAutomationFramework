package AlloTest.FootersTests;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooterUsefulInformationList extends TestInit {

    FooterLocators locators;
    List<String> getWords;
    List<String> listMyWords;

    @Test

    public void FooterUsefulInformationList(){
        locators = new FooterLocators (driver);
        driver.get("https://allo.ua");
        usefulInfo();
        listMyWords();
        System.out.println(getWords.containsAll(listMyWords));
    }
    private void usefulInfo() {
        List<WebElement> list = locators.footerUsefulInformationList();
        getWords =new LinkedList<>();
        for(WebElement token: list){
            String words = token.getText();
            System.out.println(words);
            getWords.addAll(Collections.singleton(words));
        }
    }
    private void listMyWords() {
        listMyWords = new LinkedList<>();
        listMyWords.add("АЛЛО-сервіси");
        listMyWords.add("Алло-Гроші");
        listMyWords.add("Fishka");
        listMyWords.add("Кошик");
        listMyWords.add("Подарункова картка Алло");
        listMyWords.add("Страхування платіжних карт");
        listMyWords.add("Юридичний онлайн-сервіс");
    }
}
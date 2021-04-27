package RazooM.AlloTest.FootersTests;

import RazooM.AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooterCompani extends TestInit {

    FooterLocators locators;
    LinkedList<String> listMyWords;
    List<String> getWords;

    @Test
    public void footerCompani(){
        locators = new FooterLocators(driver);
        driver.get ("https://allo.ua");
        footerAlloCompani();
        listMyWords();
        System.out.println(getWords.containsAll(listMyWords));
    }
    private void footerAlloCompani(){
        List<WebElement> list = locators.footerCompaniList();
        getWords =new LinkedList<>();
        for(WebElement token: list){
            String words = token.getText();
            System.out.println (words);
            getWords.addAll(Collections.singleton (words));
        }
    }
    private void listMyWords() {
        listMyWords = new LinkedList<> ();
        listMyWords.add ("Про нас");
        listMyWords.add ("Вакансії");
        listMyWords.add ("Прес-центр");
        listMyWords.add ("Мережа магазинів");
        listMyWords.add ("Корпоративним кліентам");
        listMyWords.add ("Контакти");
        listMyWords.add ("Умови використання сайту");
        listMyWords.add ("Як продавати на Allo.ua");
    }
}
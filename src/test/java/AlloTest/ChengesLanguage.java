package AlloTest;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChengesLanguage extends TestInit {

    PageHomeAllo locators;

    @Test
    public void chengesLanguage(){
        locators = new PageHomeAllo (driver);
        openUrl("https://allo.ua/ru/");
        sleep (3);
        locators.chengesLanguage().click();
        sleep (3);
        String x = locators.checkLanguage ().getText();
        String y = "Каталог товарів";
             if(y.equals (x)){
                 System.out.println ("Переключило на укр.язык = " +y);
             } else {
                 System.out.println ("Сейчас ру.язык,а должен быть укр.язык = " + x);
             }
    }
}

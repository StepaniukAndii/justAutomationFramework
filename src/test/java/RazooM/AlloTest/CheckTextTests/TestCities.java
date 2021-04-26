package RazooM.AlloTest.CheckTextTests;

import RazooM.AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestCities extends TestInit {

    PageHomeAllo locators;

    @Test
    public void testCities(){
        locators = new PageHomeAllo (driver);
        openUrl("https://allo.ua/ru/");
        sleep (1);
        locators.citiesOpenFild().click();
        locators.kharkov().click();
        sleep (3);
        locators.closeSpam().click();
        locators.citiesOpenFild().click();
        locators.odessa().click();
        sleep (3);
        locators.closeSpam().click();
        locators.citiesOpenFild().click();
        locators.dnipro().click();
        sleep (3);
        locators.closeSpam().click();
        locators.citiesOpenFild().click();
        locators.lvov().click();
        sleep (3);
        locators.closeSpam().click();
        locators.citiesOpenFild().click();
        locators.zaporozhee().click();
        sleep (3);
        locators.closeSpam().click();
        locators.citiesOpenFild().click();
        locators.inputCitie().clear();
        locators.inputCitie().sendKeys("Бровары");
        locators.citiesOpenFild().click();
        String x = locators.brovaryCitie().getText();
        String y ="Бровары";
            if(y.equals(x)){
                System.out.println ("Город Бровары выбрало");
            } else {
                System.out.println ("Город Бровары не выбрало");
            }
    }
}
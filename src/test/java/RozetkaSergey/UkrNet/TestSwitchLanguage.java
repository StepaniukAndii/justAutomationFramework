package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends TestInit    {
    String byUkraineFromSite;
    String byRussianFromSite;
    String whatIExpectInRus = "Поиск";
    String whatIExpectInUa = "Пошук";


    @Test
    public void switchLanguage (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        byUkraineFromSite = ukrNetPages.postInUkraineOrRussian().getAttribute("value");
        ukrNetPages.ukraineLanguageButton().click();
        ukrNetPages.searchInUkraine().click();
        sleep(1);
        byRussianFromSite = ukrNetPages.searchInRussian().getAttribute("value");
        Assert.assertEquals(whatIExpectInRus,byRussianFromSite);
        Assert.assertEquals(whatIExpectInUa, byUkraineFromSite);
    }
}

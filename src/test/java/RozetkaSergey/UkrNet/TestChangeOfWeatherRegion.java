package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.annotations.Test;

public class TestChangeOfWeatherRegion extends TestInit  {
    @Test
    public void asd (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
    }
}

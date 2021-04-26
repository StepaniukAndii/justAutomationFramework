package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.annotations.Test;


public class TestCheckIframe1 extends TestInit {
    @Test
    public void CheckIframe1 (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        driver.get("https://ukr.net");
        switchToIframe();
        ukrNetPages.statisticInWorld().get(1).click();
        sleep(1);
    }
    public void switchToIframe (){
        driver.switchTo().frame(getElement("//iframe[@id='covidF']"));
    }
}

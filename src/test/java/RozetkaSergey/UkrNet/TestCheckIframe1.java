package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.*;

public class TestCheckIframe1 extends TestInit {
    @Test
    public void CheckIframe1 (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        switchToIframe();
        ukrNetPages.statisticInWorld().get(1).click();
        sleep(1);
    }
    public void switchToIframe (){
        driver.switchTo().frame(getElement("//iframe[@id='covidF']"));
    }
}

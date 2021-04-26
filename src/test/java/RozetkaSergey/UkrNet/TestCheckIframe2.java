package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCheckIframe2 extends TestInit {
    @Test
    public void checkIframe2 (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        moveMouseToElement(getElement("/html/body/div[1]/main/div[2]/div/div/div[2]/iframe"));
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/iframe")).click();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(0));
        sleep(1);
    }
}

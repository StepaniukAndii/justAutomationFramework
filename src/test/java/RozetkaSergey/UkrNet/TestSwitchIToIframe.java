package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSwitchIToIframe extends TestInit {
    @Test
    public void switchToIframe() {

        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        switchIn();
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        ukrNetPages.buttonGoLogo().click();
        ukrNetPages.buttonСhangeCity().click();
    }

    public void switchIn() {
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='sinoptik_container']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//img[@src='//pinformer.sinoptik.ua/img/t.gif']")).click();
        driver.switchTo().defaultContent();
    }
}

package RozetkaSergey.TestsRozetka;

import ClasesToAllUs.TestInit;
import RozetkaSergey.RozetkaPages.RozetkaPages8_12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FastToUpButton extends TestInit {

    @Test
    public void fastToUpButton () {
        RozetkaPages8_12 rozetkaPages8_12 = new RozetkaPages8_12(driver);
        rozetkaPages8_12.enterToRozetka("https://rozetka.com.ua/");
        rozetkaPages8_12.closeAdvertisement().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleep(1);
        driver.findElement(By.xpath("//a[@class='link-to-top']")).click();
        sleep(1);

    }
}

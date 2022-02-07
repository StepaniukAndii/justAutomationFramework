package Pashkovsky;

import ClasesToAllUs.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBuy extends TestInit {

    @Test
    public void testSelenium() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua/");
        homePage.inputPhone().sendKeys("телефон xiaomi");
        homePage.getBtnSend().click();
        homePage.selectPhone().click();
        homePage.clouseDropWindow().click();
        homePage.getBtnBuy().click();
        //homePage.btnOformitZakaz().click();
         Assert.assertTrue(driver.getCurrentUrl().contains("/xiaomi-mi-11-lite-5g-ne-8-128gb-truffle-black/"));
    }

    @org.testng.annotations.Test
    public void testSelenium1(){
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.xpath("//button[@id='fat-menu']")).click();
        chromeDriver.findElement(By.xpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//a[@title='Компьютеры' and @class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//span[text()=' Компьютер Everest Home 4070 (4070_9414) ']")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//button[@ class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted' ]")).click();


    }
}

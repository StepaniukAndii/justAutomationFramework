package Pashkovsky;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @org.testng.annotations.Test
    public void testSelenium() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.xpath("//input")).sendKeys("телефон xiaomi");
        chromeDriver.findElement(By.xpath("//button[@ class=\"button button_color_green button_size_medium search-form__submit ng-star-inserted\" ]")).click();
        chromeDriver.findElement(By.xpath("//span[ text()=' Мобильный телефон Xiaomi 11 Lite 5G NE 8/128GB Truffle Black ']")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//button[@ class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted' ]")).click();
        sleep(2);
        chromeDriver.findElement(By.xpath("//div/a[@class=\"button button_size_large button_color_green cart-receipt__submit ng-star-inserted\" ]")).click();
        //   String url = chromeDriver.getCurrentUrl();
        //chromeDriver.close();
        //   System.out.println(url);
        // Assert.assertEquals(url, "https://rozetka.com.ua/");
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

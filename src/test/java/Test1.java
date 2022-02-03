import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void implicitWait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    @Test
    public void url2(){
        implicitWait(5);
        glavnaStranica();
        naVesEkran();
        knopkaMenu();
        kategorii();
        komputery();
        viborKomputera();
        knopkaKupit();
    }

    private void knopkaKupit() {
        driver.findElement(By.xpath("//button[@ class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted' ]")).click();
    }

    private void viborKomputera() {
        driver.findElement(By.xpath("//span[text()=' Компьютер Everest Home 4070 (4070_9414) ']")).click();
    }

    private void komputery() {
        driver.findElement(By.xpath("//a[@title='Компьютеры' and @class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']")).click();
    }

    private void kategorii() {
        driver.findElement(By.xpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")).click();
    }

    private void knopkaMenu() {

        driver.findElement(By.xpath("//button[@id='fat-menu']")).click();
    }

    private void naVesEkran() {

        driver.manage().window().maximize();
    }

    private void glavnaStranica() {
        driver.get("https://rozetka.com.ua");
    }


    //  @AfterMethod
    // public void after(){
    //     driver.quit();
    // }
}

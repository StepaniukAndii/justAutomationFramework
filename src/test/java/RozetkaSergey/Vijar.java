package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vijar extends TestInit {

    String login = "grinred69@gmail.com";
    String pass = "23112010vi";

    @Test
    public void loginTest() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToGoogle("https://www.google.com");
        homePageVijar.googleField().sendKeys("Вияр");
        enter();
        sleep(1);
        goToVijar().click();
        sleep(1);
        closeAdverb().click();
        sleep(1);
        goToEnter().click();
        sleep(1);
        getLogin().sendKeys(login);
        getPass().sendKeys(pass);
        sleep(1);
        clickEnter().click();
        sleep(1);
        closeAdverb().click();
        sleep(1);
    }

    public WebElement goToVijar() {
        return driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md' and text()='Вияр - интернет-магазин мебельной фурнитуры. Все ...']"));
    }

    public WebElement goToEnter() {
        return driver.findElement(By.xpath("//div[@class='login-in']//a[@id='modal_ancor']"));
    }

    public WebElement closeAdverb() {
        return driver.findElement(By.xpath("//img[@src='/img/close_white-24px.svg']"));
    }

    public WebElement getLogin() {
        return driver.findElement(By.xpath("//input[@class='flat_input login']"));
    }

    public WebElement getPass() {
        return driver.findElement(By.xpath("//input[@class='flat_input password']"));
    }

    public WebElement clickEnter() {
        return driver.findElement(By.xpath("//input[@class='login_btn']"));
    }
}

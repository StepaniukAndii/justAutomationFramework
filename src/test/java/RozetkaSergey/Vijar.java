package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vijar extends TestInit {

    @Test
    public void loginTest() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToGoogle("https://www.google.com");
        homePageVijar.googleField().sendKeys("Вияр");
        enter();
        homePageVijar.goToVijar().click();
        sleep(1);
        homePageVijar.closeAdverb().click();
        homePageVijar.goToEnter().click();
        homePageVijar.getLogin().sendKeys(homePageVijar.getterLogin());
        homePageVijar.getPass().sendKeys(homePageVijar.getterPass());
        homePageVijar.clickEnter().click();
        sleep(1);
        homePageVijar.closeAdverb().click();
        System.out.println("Sehr gut!");
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

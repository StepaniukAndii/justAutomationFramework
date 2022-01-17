package AlyonaBoychuk.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void checkAboutUs() {driver.findElement(By.xpath("//a [@ui-sref='about-us']")).click();
    }

    public void clickGetTheAppLink() {
        driver.findElement(By.xpath("//a[text()='Get The App']")).click();
    }

    public void clouseGoItbutton() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    public boolean getUrlAboutUsIsDisplayed(){
        return driver.getCurrentUrl().contains("about-us");
    }

    public void getSignInLink() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();

    }

    public boolean getLifeChat() {
        return driver.findElement(By.xpath("//span[text()='Live Chat']")).isDisplayed();
    }
}

package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeEatstreetPage extends BasePage {


    public HomeEatstreetPage(WebDriver driver) {
        super(driver);

    }
    public WebElement getSignInBtn(){
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));

    }
    public List<WebElement> getMyAccountBtn(){
        return driver.findElements(By.xpath("//a[@id='menu-my-account']"));

    }
    public WebElement myAccountBtn(){
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));

    }
    public WebElement getGoItBtn(){
        return  driver.findElement(By.xpath("//button[@class='btn']"));

    }

}

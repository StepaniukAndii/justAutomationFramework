package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeEatstreetPage extends BasePage {


    public HomeEatstreetPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSignInBtn(){
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }
}

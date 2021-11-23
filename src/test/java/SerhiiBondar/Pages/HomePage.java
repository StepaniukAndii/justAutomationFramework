package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);

    }
    public SingInPage goToSigInPage() {
        return new SingInPage(driver);

    }
    public WebElement getEmailBtn(){
        return driver.findElement(By.xpath("//a[@href='/login']"));

    }
}

package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Allo extends BasePage {

    private AlloSale alloSale;

    public Allo (WebDriver driver){super(driver);}

    public AlloSale getAlloSale() {
        if (alloSale==null) {
            return new AlloSale(driver);
        }
        return alloSale;
    }

    public WebElement btnProFile(){
        return driver.findElement(By.xpath("//button[@aria-label=\"Профіль\"]"));
    }
    public WebElement btnSignIn(){
        return driver.findElement(By.xpath("//button[@class=\"modal-submit-button\"]"));
    }
    public WebElement fieldIsRequired(){
        return driver.findElement(By.xpath("//label[@for=\"v-login-password\"]"));
    }
    public WebElement btnSignUp(){
        return findElement("HomePage homePage = new HomePage(driver);");
    }
    public WebElement btnSale(){
        return findElement("//a[@href=\"https://allo.ua/ua/events-and-discounts/\"][1]");
    }
}

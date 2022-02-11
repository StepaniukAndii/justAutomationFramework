package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JustEat extends BasePage {

    public JustEat(WebDriver driver){super(driver);}
    public void openJustEat(){
         driver.get("https://just-eat.by/minsk");
    }
    public WebElement btnSinIn(){
        return findElement("//div[@class=\"login\"]//a[@href=\"/login.html\"]");
    }
    public WebElement inputEmail(){
        return findElement("//input[@name=\"email\"]");
    }
    public WebElement inputPassword(){
        return  findElement("//input[@name=\"password\"]");
    }
    public WebElement btnLogin(){
        return findElement("//a[@id=\"simplecheckout_button_login\"]");
    }
    public  WebElement error(){
        return findElement("//div[@class=\"simplecheckout-warning-block\"]");
    }
    public WebElement banerCity(){
        return findElement("//div[@id=\"your-city\"]/a[@class=\"close\"]");
    }
}

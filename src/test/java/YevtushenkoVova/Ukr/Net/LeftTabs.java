package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftTabs extends BasePage {

    public LeftTabs(WebDriver driver){super(driver);}
    public WebElement linkSinopyik(){
        return findElement("//a[@href=\"https://ua.sinoptik.ua/\"]");
    }
    public WebElement inputOnSinoptik(){
        return findElement("//input[@id=\"search_city\"]");
    }
    public WebElement inputLogin(){return findElement("//input[@id=\"id-input-login\"]");}
    public WebElement inputPassword(){return findElement("//input[@name='password']");}
    public WebElement btnSignIn(){return findElement("//button[@class=\"form__submit\"]");}
    public WebElement errorData(){return findElement("//p[@class=\"form__error form__error_wrong form__error_visible\"]");}
}

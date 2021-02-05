package AlloTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHomeAllo extends BasePageAllo{

    public PageHomeAllo(WebDriver driver){
        super(driver);
    }

    public WebElement singIn(){
        return findElement ("//button[@class='authentication__button--login']");
    }
    public WebElement loginTab(){
        return findElement ("//li[@class='login-tab']");
    }

    public WebElement enterName(){
        return findElement ("//input[@id='v-register-name']");
    }

    public WebElement enterNumber(){
        return findElement ("//input[@id='v-register_telephone_number']");
    }
    public WebElement enterEmail(){
        return findElement ("//v-register-email']");
    }
    public WebElement enterPassword(){
        return findElement ("//input[@id='vregister-password']");
    }

    public void testComplite(){
       System.out.println ("Test Complite");
    }

    public WebElement logo(){
        return findElement ("//div[@class='v-header__line v-header__line--second page-container main-header-second-line']/a[@class='header-logo__link']");
    }

    public WebElement categoriesClick(){
        return findElement ("//div[@class='main-header__categories']");
    }

    public WebElement telefonItems(){
        return findElement ("//li[@data-id='1516']");
    }

    public WebElement appLiancesItems(){

        return findElement ("//li[@data-id='1907']");
    }

    public WebElement carsItems(){
        return findElement ("//li[@data-id='2228']");
    }

    public WebElement sportItems(){
        return findElement ("//li[@data-id='1962']");
    }

    public WebElement toolsItem(){
        return findElement ("//li[@data-id='2282']");
    }
}

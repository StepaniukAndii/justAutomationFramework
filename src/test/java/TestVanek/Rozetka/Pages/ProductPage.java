package TestVanek.Rozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver){super(driver);}

    public WebElement buyBtn(){
        return findElementByXpath("//button[contains(@class,'buy') and contains(@class,'green')]");
    }
    public WebElement continueBuy(){
        return findElementByXpath("//a[contains(@class,'button_size_medium')]");
    }
    public WebElement productTitle(){
        return  findElementByXpath("//h1[contains(@class,'product')]");
    }
    public WebElement basketBtn(){
        return findElementByXpath("//button[contains(@class,'header__button--active')]");
    }
}

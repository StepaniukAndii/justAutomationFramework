package TestVanek.Rozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){super(driver);}

    public WebElement searchInput(){
        return findElementByXpath("//input[contains(@class,'search')]");
    }
    public WebElement searchBtn(){
        return findElementByXpath("//button[contains(@class,'button_color_green')]");
    }
    public WebElement comparePageBtn(){
        return findElementByXpath("//button[contains(@aria-label,'сравнения')]");
    }
}

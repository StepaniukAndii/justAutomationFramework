package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTheUpPage extends BasePage {
    public GetTheUpPage(WebDriver driver){
        super(driver);
    }


    public WebElement clickGooglePlay(){
        return findElementByXpath("//a[@class='app-btn-android']");
    }
    public WebElement clickMyApps(){
        return findElementByXpath("//a[contains(text(),'My apps')]");
    }
    public WebElement inputEmail(){
        return findElementByXpath("//*[@id=\"identifierId\"]");
    }
    public WebElement clickNext(){
        return findElementByXpath("//div[@id='identifierNext']");
    }
    public WebElement checkInputEmail(){
        return findElementByXpath("//*[@id=\"headingText\"]/span");
    }
    public WebElement clickGames(){
        return findElementByXpath("//*[@id=\"fcxH9b\"]/div[1]/c-wiz[1]/ul/li[1]/ul/li[4]/a");
    }
    public WebElement selectGameTom(){
        return findElementByXpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz[2]/div/div[2]/c-wiz/div/c-wiz/c-wiz[2]/c-wiz/div/div[2]/c-wiz[2]/div/div[2]/div/div[1]/a/div");
    }
    public WebElement checkGameOpened(){
        return findElementByXpath("//span[contains(text(),'Talking Tom Gold Run')]");
    }

}

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

}

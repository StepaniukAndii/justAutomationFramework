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

}

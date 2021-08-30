package TestVanek.Mychords.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SongPage extends BasePage {
    public SongPage(WebDriver driver){super(driver);}

    public WebElement commentTextArea(){
        return findElementByXpath("//textarea[@class='mc-textarea']");
    }
    public WebElement commentBtn(){
        return findElementByXpath("//button[@class='mc-btn2 mc-submit']");
    }
    public List<WebElement> commentMessage(){
        return findElementsByXpath("//div[@class='mc-comment-msg']");
    }
}

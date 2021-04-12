package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExchangeProduksLokators extends BasePage {

    public ExchangeProduksLokators(WebDriver driver) {
        super (driver);
    }
    public WebElement exchangeButton(){
        return getElement ("//a[@class='allo-programs__link']/p[text()='Алло Обмен']");
    }
    public WebElement choiceMyNewTellSamsung(){
        return getElement ("//div[@id='mCSB_1_container']/div[@class='inner']/a[text()='Samsung']");
    }
    public WebElement serchMyNewTell(){
        return getElement ("//article[@class='new-device']//input");
    }
    public WebElement modelMyNewBlack(){
        return getElement ("//a[@data-id='112542']");
    }
    public WebElement choiceMyOldTellSamsung(){
        return getElement ("//div[@id='mCSB_3_container']/div[@class='inner']/a[text()='Apple']");
    }
    public WebElement serchMyOldTell(){
        return getElement ("//article[@class='old-device']//input");
    }
    public WebElement modelMyOldBlack(){
        return getElement ("//a[@data-id='15687']");
    }
    public WebElement priceTell(){ return getElement ("//div[@class='c-1']//span");}
    public WebElement discountTell(){ return getElement ("//div[@class='c-2']//span");}
    public WebElement leftToPayTell(){ return getElement ("//div[@class='c-3']//span");}
}
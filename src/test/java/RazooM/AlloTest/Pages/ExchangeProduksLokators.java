package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExchangeProduksLokators extends BasePage {

    public ExchangeProduksLokators(WebDriver driver) {
        super (driver);
    }
    public WebElement exchangeButton(){
        return findElementByXpath("//a[@class='allo-programs__link']/p[text()='Алло Обмен']");
    }
    public WebElement choiceMyNewTellSamsung(){
        return findElementByXpath("//div[@id='mCSB_1_container']/div[@class='inner']/a[text()='Samsung']");
    }
    public WebElement serchMyNewTell(){
        return findElementByXpath("//article[@class='new-device']//input");
    }
    public WebElement modelMyNewBlack(){
        return findElementByXpath("//a[@data-id='112542']");
    }
    public WebElement choiceMyOldTellSamsung(){
        return findElementByXpath("//div[@id='mCSB_3_container']/div[@class='inner']/a[text()='Apple']");
    }
    public WebElement serchMyOldTell(){
        return findElementByXpath("//article[@class='old-device']//input");
    }
    public WebElement modelMyOldBlack(){
        return findElementByXpath("//a[@data-id='15687']");
    }
    public WebElement priceTell(){ return findElementByXpath("//div[@class='c-1']//span");}
    public WebElement discountTell(){ return findElementByXpath("//div[@class='c-2']//span");}
    public WebElement leftToPayTell(){ return findElementByXpath("//div[@class='c-3']//span");}
}
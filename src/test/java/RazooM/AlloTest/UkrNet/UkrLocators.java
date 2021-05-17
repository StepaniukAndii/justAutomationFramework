package RazooM.AlloTest.UkrNet;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrLocators extends BasePage {
    public UkrLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement toplivo(){
        return findElement ("//ul[@class='right-tabs__nav d-clear']/li[text()='Топливо']");
    }
    public List<WebElement> ukrPalevoListName(){
        return findElementsByXpath("//ul[@class='fuels']/li/div[@class='name']");
    }
    public List<WebElement> ukrPalevoListPrice(){
        return findElementsByXpath("//ul[@class='fuels']/li/div[@class='price']");
    }
}
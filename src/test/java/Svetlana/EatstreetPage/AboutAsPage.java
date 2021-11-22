package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutAsPage extends BasePage {
    public AboutAsPage (WebDriver driver){
        super(driver);
    }
    public List<WebElement> checkOpenUrl(){
        return findElementsByXpath("//a[contains(text(),'customer')]");
    }
    public WebElement checkOpenReportLink(){
        return findElementByXpath("//a[@ui-sref='account']");
    }
}

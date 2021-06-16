package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GooglePositionLocators extends BasePage {
    public GooglePositionLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement serchGoogle(){return findElementByXpath("//input[@class='gLFyf gsfi']");}
    public List<WebElement>  serchItems(){return findElementsByXpath("//div[@class='yuRUbf']/a");}
    public WebElement nextList(){return findElementByXpath("//td[@class='d6cvqb'][2]");}
}
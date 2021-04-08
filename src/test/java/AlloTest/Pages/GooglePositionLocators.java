package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GooglePositionLocators extends BasePage {
    public GooglePositionLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement serchGoogle(){return getElement ("//input[@class='gLFyf gsfi']");}
    public List<WebElement>  serchItems(){return getElements ("//div[@class='yuRUbf']/a");}
    public WebElement nextList(){return getElement ("//td[@class='d6cvqb'][2]");}
}

package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckingProductCatalogLocators extends BasePage {
    public CheckingProductCatalogLocators(WebDriver driver) {
        super (driver);
    }
    public List<WebElement> alloPrograms(){return findElementsByXpath("//ul[@class='allo-programs__list']/li");}
}

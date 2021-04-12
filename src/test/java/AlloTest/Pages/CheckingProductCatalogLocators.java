package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckingProductCatalogLocators extends BasePage {
    public CheckingProductCatalogLocators(WebDriver driver) {
        super (driver);
    }
    List<WebElement> menuBlockLeft(){return getElements ("class='menu__list js-menu__list'");}

}

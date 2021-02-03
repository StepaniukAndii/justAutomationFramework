package AliExpres;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAliExpres extends BasePage {

    public PageAliExpres(WebDriver driver) {
        super (driver);
    }

    public WebElement serchFild() {
        return findElement ("//input[@id='search-form__input']");
    }
}

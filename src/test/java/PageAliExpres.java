import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAliExpres extends BasePage {

    public PageAliExpres(WebDriver driver) {
        super (driver);
    }

    public WebElement serchFild() {
        return driver.findElement (By.xpath ("//input[@id='search-form__input']"));
    }

    public WebElement closeSpam() {
        return driver.findElement (By.xpath ("//div[@id='cookies-banner__container__close-btn']"));
    }

}

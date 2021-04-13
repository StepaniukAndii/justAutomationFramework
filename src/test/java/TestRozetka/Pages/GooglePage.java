package TestRozetka.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GooglePage extends BasePage {
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> serchLink(){return driver.findElements (By.xpath("//div[@class='yuRUbf']/a"));}
    public WebElement nextList(){return getElement ("//td[@class='d6cvqb'][2]");}
}

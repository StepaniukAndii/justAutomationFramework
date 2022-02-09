package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VyborTovara extends BasePage {
    public VyborTovara(WebDriver driver){
        super(driver);
    }

    public List<WebElement> btnVyborTovara(){
        return driver.findElements(By.xpath("//img[@src='https://static.prego.ua/photo?n=43def57e-84fd-47e3-8701-bae5e026861d.jpg&s=279&q=80']"));
    }
}

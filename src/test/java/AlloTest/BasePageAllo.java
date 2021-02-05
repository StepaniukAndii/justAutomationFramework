package AlloTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BasePageAllo{

    WebDriver driver;

    public BasePageAllo(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findElement(String locator){
        return driver.findElement (By.xpath (locator));
    }
    public List<WebElement> findElements(String locator){
        return driver.findElements(By.xpath(locator));
    }
}

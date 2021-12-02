package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlogEatStreetPage extends BasePage {

    public BlogEatStreetPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> clickLGBTO() {
        return driver.findElements(By.xpath("//h3[@class='entry-title']/a"));
    }

    public List<WebElement> listRestLGBTO() {
        return driver.findElements(By.xpath("//p[@class='has-text-align-left']/a"));
    }
}


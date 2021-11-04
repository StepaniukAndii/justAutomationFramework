package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestPage extends BasePage {

    public RestPage(WebDriver driver) {
        super(driver);
    }
    public WebElement nameOfRest(){
        return findElement("//h1[contains(@class, 'name')]");
    }
}


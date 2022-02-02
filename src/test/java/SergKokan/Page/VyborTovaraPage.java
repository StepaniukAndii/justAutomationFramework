package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyborTovaraPage extends BasePage {
    public VyborTovaraPage(WebDriver driver) {
        super(driver);
    }
    public WebElement OpenUrl(){
        return findElementByXpath("https://prego.ua/");
    }

    public WebElement btnVyborTovara() {
        return findElementByXpath("//div[@id='allArticles']/article[1]");
    }
}

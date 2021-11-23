package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage extends BasePage {
    public ArticlePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkBackToTheFuture2() {
        return findElementByXpath("//a[@title='Назад в будущее 2']");
    }

    public WebElement getTextOnFuture2() {
        return findElementByXpath("//h1[@id='firstHeading']");
    }
}
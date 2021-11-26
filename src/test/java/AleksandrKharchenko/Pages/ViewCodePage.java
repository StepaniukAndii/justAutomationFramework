package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewCodePage extends BasePage {
    public ViewCodePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLockImages() {
        return findElementByXpath("//img[@style='vertical-align: middle']");
    }

    public WebElement getProtectedLink() {
        return findElementByXpath("//a[@title='Википедия:Правила защиты страниц']");
    }

    public WebElement getAdministratorsLink() {
        return findElementByXpath("//a[@title='Википедия:Администраторы']");
    }

    public WebElement getEngineersLink() {
        return findElementByXpath("//a[@title='Википедия:Инженеры']");
    }
}
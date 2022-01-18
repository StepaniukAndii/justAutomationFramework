package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestBestPage extends BasePage {
    public RestBestPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLinkBagatopoverhivki() {
        return findElementByXpath("//a[text()='Багатоповерхівки']");
    }

    public WebElement getPrivatSector() {
        return findElementByXpath("//a[@class='selected']");
    }

    public WebElement getBiznessClientam() {
        return findElementByXpath("//a[text()='Бізнес-клієнтам']");
    }
}

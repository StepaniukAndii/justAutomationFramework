package TestRozetkaAndKinoGo.TestKinoGo.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return getElement("//input[@id='story']");
    }

    public List<WebElement> getFilmTitle() {
        return getElements("//div[@class='kino-title']/a");
    }
}
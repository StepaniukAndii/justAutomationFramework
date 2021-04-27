package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage extends BasePage {
    public CalendarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEvents() {
        return getElement("//a[@class='text wrap']/span");
    }

    public WebElement getArchive() {
        return getElement("//div[@class='wrap ']");
    }
}
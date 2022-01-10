package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public WebElement getHeatText() {
        return getElement("//span[@class='m-hide']");
    }

    public WebElement getSelectCity() {
        return getElement("//select[@name='city']");
    }

    public List<WebElement> getSelectCityChildren() {
        return getElements("//select[@name='city']/option");
    }

    public WebElement getSelectAllTags() {
        return getElement("//select[@name='tag']");
    }

    public List<WebElement> getSelectAllTagsChildren() {
        return getElements("//select[@name='tag']/option");
    }
}
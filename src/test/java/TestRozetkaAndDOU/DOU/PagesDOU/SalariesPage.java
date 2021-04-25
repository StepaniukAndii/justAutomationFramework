package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SalariesPage extends BasePage {

    public SalariesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectCity() {
        return getElement("//select[@name='city']");
    }

    public List<WebElement> getSelectCityChildren() {
        return getElements("//select[@name='city']/option");
    }

    public WebElement getSelectPosition() {
        return getElement("//select[@class='salarydec-field-title']");
    }

    public List<WebElement> getSelectPositionChildren() {
        return getElements("//select[@class='salarydec-field-title']/optgroup/option");
    }

    public WebElement getLanguage() {
        return getElement("//select[@name='language']");
    }

    public List<WebElement> getSelectLanguageChildren() {
        return getElements("//select[@name='language']/option");
    }
}
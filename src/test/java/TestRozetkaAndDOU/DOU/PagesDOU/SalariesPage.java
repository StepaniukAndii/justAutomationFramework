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
        return findElementByXpath("//select[@name='city']");
    }

    public List<WebElement> getSelectCityChildren() {
        return findElementsByXpath("//select[@name='city']/option");
    }

    public WebElement getSelectPosition() {
        return findElementByXpath("//select[@class='salarydec-field-title']");
    }

    public List<WebElement> getSelectPositionChildren() {
        return findElementsByXpath("//select[@class='salarydec-field-title']/optgroup/option");
    }

    public WebElement getLanguage() {
        return findElementByXpath("//select[@name='language']");
    }

    public List<WebElement> getSelectLanguageChildren() {
        return findElementsByXpath("//select[@name='language']/option");
    }
}
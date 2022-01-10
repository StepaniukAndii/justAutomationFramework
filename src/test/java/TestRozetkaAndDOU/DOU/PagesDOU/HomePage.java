package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return findElementByXpath("//input[@id='txtGlobalSearch']");
    }

    public WebElement getSearchBox() {
        return findElementByXpath("//input[@id='gsc-i-id1']");
    }

    public List<WebElement> getLinkTitle() {
        return findElementsByXpath("//a[@class='gs-title']");
    }

    public List<WebElement> getFilters() {
        return findElementsByXpath("//div[@class='xsort-selected']");
    }

    public List<WebElement> getHeaderButton() {
        //0 - DOU 1-главная  2 - форум 3 - лента 4 - зарплаты 5 - работа 6 - календарь 7 - youtube
        return findElementsByXpath("//header/ul/li");
    }

    public WebElement getProfile() {
        return getElement("//a[@class='min-profile']");
    }

    public WebElement getLoginLink() {
        return getElement("//a[@id='login-link']");
    }
}
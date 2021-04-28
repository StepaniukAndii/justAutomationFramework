package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ArticlesPage extends BasePage {
    public ArticlesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCategory() {
        return getElement("//select[@name='category']");
    }

    public List<WebElement> getCategoryChildren() {
        return getElements("//select[@name='category']/option");
    }
}

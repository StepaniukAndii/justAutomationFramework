package TestRozetkaAndDOU.DOU.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForumPage extends BasePage {
    public ForumPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectTopic() {
        return getElement("//select[@name='topic']");
    }

    public List<WebElement> getSelectTopicChildren() {
        return getElements("//select[@name='topic']/option");
    }
}
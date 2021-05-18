package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForumPage extends BasePage {
    public ForumPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectTopic() {
        return findElementByXpath("//select[@name='topic']");
    }

    public List<WebElement> getSelectTopicChildren() {
        return findElementsByXpath("//select[@name='topic']/option");
    }
}
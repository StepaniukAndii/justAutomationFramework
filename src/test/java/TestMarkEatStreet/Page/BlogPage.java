package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage{
    public BlogPage(WebDriver driver){super(driver);}
    public WebElement enneagramtextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to What')]");}
}

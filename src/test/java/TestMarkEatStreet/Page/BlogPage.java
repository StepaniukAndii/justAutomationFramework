package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage{
    public BlogPage(WebDriver driver){super(driver);}
    public WebElement enneagramtextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to What')]");}
    public WebElement lgbtqtextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to LGBTQ')]");}
    public WebElement compostingtextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to Nati')]");}
    public WebElement pacificislandertextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to Asian')]");}
    public WebElement earthdaytestbtn(){return findElementByXpath("//a[contains(@title,'Permalink to Earth')]");}
    public WebElement milwaukeetextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to EatStreet + Mil')]");}
    public WebElement womenrestorauntstextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to Women')]");}
    public WebElement blackrestorauntstextbtn(){return findElementByXpath("//a[contains(@title,'Permalink to Wisconsin')]");}
}

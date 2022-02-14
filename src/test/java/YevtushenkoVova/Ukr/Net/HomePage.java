package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private RightTabs rightTabs;
    private LeftTabs leftTabs;

    public HomePage (WebDriver driver){super(driver);}

    public LeftTabs getLeftTabs() {
        if (leftTabs == null) {
            return new LeftTabs(driver);
        }else return leftTabs;
    }

    public RightTabs getRightTabs(){
        if (rightTabs == null) {
            return new RightTabs(driver);
        }
        else return rightTabs;
    }

    public void openUkrNet(){
        driver.get("https://www.ukr.net/");
    }
    public WebElement search(){return findElement("//input[@id=\"search-input\"]");}
    public WebElement golovne(){return findElement("//h2/a[@href=\"https://www.ukr.net/news/main.html\"]");}
    public WebElement golovneAssert(){return findElement("//h2[contains(text(),'Головні події')]");}
}

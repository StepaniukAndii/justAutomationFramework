package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;

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
}

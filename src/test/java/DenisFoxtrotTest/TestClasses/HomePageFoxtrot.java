package DenisFoxtrotTest.TestClasses;

import ClasesToAllUs.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageFoxtrot extends BasePage {

    public HomePageFoxtrot(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch() {
        return findElementByXpath("//input[@type='search']");
    }


}

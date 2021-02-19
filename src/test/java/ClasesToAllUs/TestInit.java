package ClasesToAllUs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.LinkedList;
import java.util.List;

public class TestInit {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    //when you need to push the "enter"
    public void pushBtnReturn() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.RETURN);
        action.perform();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void moveMouseToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public List<String> getAllElementsWithAttribute(List<WebElement> webElementList, String attribute) {
        LinkedList<String> listElements = new LinkedList<String>();
        for (WebElement element : webElementList) {
            listElements.add(element.getAttribute(attribute));
        }
        return listElements;
    }
}

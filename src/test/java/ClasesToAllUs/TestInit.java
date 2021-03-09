package ClasesToAllUs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInit {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

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

    public void googleIt(String textToGoogle) {
        navigationGoogle();
        getGoogleSearchField().sendKeys(textToGoogle + "\n");
    }

    public void navigationGoogle() {
        driver.get("https://google.com");
    }
    private WebElement getGoogleSearchField() {
        return getElement("//input[@class='gLFyf gsfi']");}

    public WebElement getElement(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void enter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.RETURN);
        actions.perform();
    }
}

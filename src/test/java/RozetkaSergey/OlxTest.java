package RozetkaSergey;

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
import org.testng.annotations.Test;

public class OlxTest {

    @Test
    public void justTest() {
        entryGoogle();
        googleSearchField().sendKeys("OLX");
        enter();
        sleep(1);
        goToOlx().click();
        sleep(1);
        olxSearchField().sendKeys("Бойлер");
        enter();
        sleep(1);
        chooseWithImage().click();
        chooseRubric().click();
        moveMouseToElement(driver.findElement(By.xpath("")));
    }

    public void moveMouseToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

//    public void moveMouseToElement(WebElement element){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();

    public WebElement chooseRubric() {
        return getElement("//a[@class='block select category-icon  rel nowrap tdnone overh']");
    }

    public WebElement chooseWithImage() {
        return getElement("//label[@for='photo-only'] [1]");
    }

    public WebElement olxSearchField() {
        return getElement("//input[@id='headerSearch']");
    }

    public WebElement goToOlx() {
        return getElement("//span[text()='Сервис объявлений OLX: сайт объявлений в Украине ...']");
    }

    public void entryGoogle() {
        driver.get("https://google.com");
    }

    public WebElement googleSearchField() {
        return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public void enter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.RETURN);
        actions.perform();
    }

    public WebElement getElement(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
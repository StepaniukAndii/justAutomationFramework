package TestCocaColaByDmitriyUl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeCookie() {
        explicitWaitToBeClickable("//button[contains(text(), 'Відхилити все')]").click();
    }

    public void navigateHomePage() {
        driver.get("https://www.coca-cola.ua/");
    }


    public WebElement explicitWaitToBeClickable(String xpath) {
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return element;
    }


    public void checkResult() {
        driver.getCurrentUrl().contains("https://www.coca-cola.ua/");
    }

    public void navigateBar() {
        driver.findElement(By.xpath("//div[@class=\"navbar-toggler collapsed\"]")).click();
    }

    public void checkResultNavBar() {
        driver.findElement(By.xpath("//div[@class=\"navbar-collapse js-nav-collapse collapse show\"]")).isDisplayed();
    }

    public void clickOurBrands() {
        explicitWaitToBeClickable("//a[contains(text(), ' Наші бренди ')]").click();

    }

    public void clickLogo() {
        explicitWaitToBeClickable("//img[@class=\"d-none d-lg-block\"]\n").click();

    }

    public void checkResultLogo() {
        driver.getCurrentUrl().contains("https://www.coca-cola.ua/home");
    }

    @AfterMethod
    public void quit() {
        driver.close();
    }
}

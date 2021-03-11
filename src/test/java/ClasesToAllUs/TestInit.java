package ClasesToAllUs;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.util.LinkedList;
import java.util.List;

public class TestInit {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

//    put false here if you want to see browser)
    boolean headless = true;

    @BeforeMethod
    public void setUp() {
//        if webdriver manager worrk fine, there is a bug at the moment
//        WebDriverManager.chromedriver_88_mac().setup();

        if (isOSMac()){
            setProperty("src/test/drivers/chromedriver_88_mac");
        }else if (isOSWindows()){
            setProperty("src/test/drivers/chromedriver_88_windows.exe");
        }else {
            setProperty("src/test/drivers/chromedriver_88_linux");
        }

        driver = new ChromeDriver(options);
        if(headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }

    }

    private void setProperty(String path) {
        System.setProperty("webdriver.chrome.driver", path);
        if (headless){
            options.addArguments("--headless");
        }
    }

    private boolean isOSWindows() {
        return getOSName().contains("win");
    }

    private boolean isOSMac() {
        return getOSName().contains("mac");
    }

    private String getOSName() {
        return System.getProperty("os.name").toLowerCase();
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
    public List<String> getAllElementsWithAttribute(List<WebElement> webElementList, String attribute) {
        LinkedList<String> listElements = new LinkedList<String>();
        for (WebElement element : webElementList) {
            listElements.add(element.getAttribute(attribute));
        }
        return listElements;
    }
}
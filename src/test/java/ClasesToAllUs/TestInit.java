package ClasesToAllUs;

import RozetkaSergey.RozetkaPages.RozetkaPages5_34;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import testRozetkaDenis.pages.ProductPage;

import java.util.LinkedList;
import java.util.List;

public class TestInit {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

//    put false here if you want to see browser)
    boolean headless = false;

    @BeforeMethod
    public void setUp() {
//        if webdriver manager work fine, there is a bug at the moment
//        WebDriverManager.chromedriver_88_mac().setup();

        if (isOSMac()){
            setProperty("src/test/drivers/chromedriver_91_mac");
        }else if (isOSWindows()){
            setProperty("src/test/drivers/chromedriver_91_windows.exe");
        }else {
            setProperty("src/test/drivers/chromedriver_90_linux");
        }

        driver = new ChromeDriver(options);
        if(headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }
    }

    public boolean isElementPresent(String locator){
        List<WebElement> elements = driver.findElements(By.xpath(locator));
        return elements.size() > 0;
    }

    public void closeAdIfExist() {
        RozetkaPages5_34 rozetkaPages5_34 = new RozetkaPages5_34(driver);
        if (isElementPresent(rozetkaPages5_34.closeAdvertisementLocator)){
            rozetkaPages5_34.closeAdvertisement().click();
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

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

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
    public void moveMouseToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void googleIt(String textToGoogle) {
        navigationGoogle();
        getGoogleSearchField().sendKeys(textToGoogle + "\n");
    }

    private void navigationGoogle() {
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
    public List<String> getAttributeCollection(List<WebElement> webElementList, String attribute) {
        LinkedList<String> listElements = new LinkedList<String>();
        for (WebElement element : webElementList) {
            listElements.add(element.getAttribute(attribute));
        }
        return listElements;
    }

    public List<String> getElementsText(List<WebElement> webElementList) {
        LinkedList<String> listElements = new LinkedList<String>();
        for (WebElement element : webElementList) {
            listElements.add(element.getText());
        }
        return listElements;
    }

    public void disableAdInRozetka(ProductPage productPage) {
        if (headless = false) {
            productPage.disableAd().click();
        }
    }
}

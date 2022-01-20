package AlyonaBoychuk.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void checkAboutUs() {driver.findElement(By.xpath("//a [@ui-sref='about-us']")).click();
    }

    public void clickGetTheAppLink() {
        driver.findElement(By.xpath("//a[text()='Get The App']")).click();
    }

    public void clouseGoItbutton() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    public boolean getUrlAboutUsIsDisplayed(){
        return driver.getCurrentUrl().contains("about-us");
    }

    public void getSignInLink() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();

    }

    public boolean getLifeChat() {
        return driver.findElement(By.xpath("//span[text()='Live Chat']")).isDisplayed();
    }

    private void openURLLinkedin() {driver.findElement(By.xpath("https://www.linkedin.com/feed/")).isDisplayed();
    }
    public void getButtonAgreeAndJoin() {driver.findElement(By.xpath("//button[@class='join-form__form-body-submit-button']")).click();
    }
    public void getButtonCookiePolicy() {driver.findElement(By.xpath("//a[@data-tracking-control-name='registration-frontend_join-form-cookie-policy']")).click();}

    public boolean numberOfWindows(){
        return new WebDriverWait(driver, 10)
        .until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    public WebElement getButtonKabinet() {
        return driver.findElement(By.xpath("//a[text()='ОСОБИСТИЙ КАБІНЕТ']"));
    }

    public boolean isDisplayedPlatagi() {
        return driver.findElement(By.xpath("//a[text()='Платежі']")).isDisplayed();
    }

    public boolean isDisplayedPopovnytyRahunok() {
        return driver.findElement(By.xpath("//a[text()='- ПОПОВНИТИ РАХУНОК']")).isDisplayed();
    }

    public boolean isDisplayedTymchasovyyPlatig() {
        return driver.findElement(By.xpath("//a[text()='- ТИМЧАСОВИЙ ПЛАТІЖ']")).isDisplayed();
    }

    public WebElement getButtonTaryfy() {
        return driver.findElement(By.xpath("//a[text()='ТАРИФИ']"));
    }

    public WebElement getButtonBagatopoverhivky() {
        return driver.findElement(By.xpath("//a[text()='Багатоповерхівки']"));
    }

    public boolean isDisplayedBeskoshtovnyiPaket() {
        return driver.findElement(By.xpath("//a[text()='безкоштовний пакет IPTV']")).isDisplayed();
    }

    public WebElement getButtonPrivatniySector() {
        return driver.findElement(By.xpath("//a[text()='Приватний сектор']"));
    }

    public boolean isDisplayedBezlim190() {
        return driver.findElement(By.xpath("//td[@class='nazva']")).isDisplayed();
    }

    public boolean isDisplayedBezlim260() {
        return driver.findElement(By.xpath("//td[text()='Безліміт 260 ']")).isDisplayed();
    }

    public boolean isDisplayedBezlim350() {
        return driver.findElement(By.xpath("//td[text()='Безліміт 350 ']")).isDisplayed();
    }

    public WebElement getButtonIPTV() {
        return driver.findElement(By.xpath("//a[text()='IPTV']"));
    }

    public WebElement getButtonPorivnyannya() {
        return driver.findElement(By.xpath("//a[text()='порівняльний список']"));
    }

    public boolean isDisplayed4() {
        return driver.findElement(By.xpath("//body[@class='body-trinity']")).isDisplayed();
    }

    public WebElement getButtonOplata() {
       return driver.findElement(By.xpath("//a[text()='ОПЛАТА']"));
    }

    public WebElement getButtonZnachennya() {
        return findElementByXpath("//input[@placeholder='Введіть значення']");
    }

    public WebElement getButtonClick() {
        return driver.findElement(By.xpath("//button[@class='sc-VigVT cQOKFU']"));
    }

    public boolean isDisplayedOplata() {
        return findElementByXpath("//div[@class='sc-iAyFgw kewEJQ']").isDisplayed();
    }

    public WebElement getButtonSingIn() {
        return findElementByXpath("//div[@class='sc-fjdhpX btpMPh']");
    }

    public boolean isDisplayedGo() {
        return findElementByXpath("//div[@class='sc-fjdhpX btpMPh']").isDisplayed();
    }

    public WebElement getButtonGamanec() {
        return driver.findElement(By.xpath("//div[text()='Гаманець']"));
    }


    public boolean isDisplayedPlayMarket() {
        return findElementByXpath("//div[@class='sc-fjdhpX btpMPh']").isDisplayed();
    }

    public WebElement getButtonBeskoshtovniyPaket() {
        return driver.findElement(By.xpath("//a[text()='безкоштовний пакет IPTV']"));
    }

    public boolean isDisplayedPromo() {
        return findElementByXpath("//h1[text()='Промо']").isDisplayed();
    }

    public WebElement getButtonDogovir() {
        return driver.findElement(By.xpath("//a[text()='Договір 1']"));
    }

    public boolean isDisplayedOsnovniPonyattya() {
        return findElementByXpath("//h4[text()='1. ОСНОВНІ ПОНЯТТЯ ТА ВИЗНАЧЕННЯ']").isDisplayed();
    }
}

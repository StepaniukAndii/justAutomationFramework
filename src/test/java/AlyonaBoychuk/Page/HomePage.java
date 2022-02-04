package AlyonaBoychuk.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void checkAboutUs() {
        driver.findElement(By.xpath("//a [@ui-sref='about-us']")).click();
    }

    public void clickGetTheAppLink() {
        driver.findElement(By.xpath("//a[text()='Get The App']")).click();
    }

    public void clouseGoItbutton() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    public boolean getUrlAboutUsIsDisplayed() {
        return driver.getCurrentUrl().contains("about-us");
    }

    public void getSignInLink() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();

    }

    public boolean getLifeChat() {
        return driver.findElement(By.xpath("//span[text()='Live Chat']")).isDisplayed();
    }

    private void openURLLinkedin() {
        driver.findElement(By.xpath("https://www.linkedin.com/feed/")).isDisplayed();
    }

    public void getButtonAgreeAndJoin() {
        driver.findElement(By.xpath("//button[@class='join-form__form-body-submit-button']")).click();
    }

    public void getButtonCookiePolicy() {
        driver.findElement(By.xpath("//a[@data-tracking-control-name='registration-frontend_join-form-cookie-policy']")).click();
    }

    public boolean numberOfWindows() {
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

    public WebElement getButtonGepon() {
        return driver.findElement(By.xpath("//a[text()='FTTH / GEPON']"));
    }

    public WebElement getButtonGeponClick() {
        return driver.findElement(By.xpath("//a[text()='GEPON']"));
    }

    public boolean isDisplayedVikipediya() {
        return findElementByXpath("//span[text()='Заглавная страница']").isDisplayed();
    }

    public WebElement getIconHeder() {
        return driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
    }

    public boolean isDisplayed() {
        return findElementByXpath("//a[@id='nav_translate_btn']").isDisplayed();
    }

    public WebElement getButtonLoginIn() {
        return driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
    }

    public WebElement getButtonShow() {
        return driver.findElement(By.xpath("//span[@class='_8HgG3']"));
    }

    public WebElement getButtonLogin() {
        return driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']"));
    }

    public boolean isDisplayedForGot() {
        return findElementByXpath("//a[text()='Forgot password?']").isDisplayed();
    }


    public boolean getButtonLoginClick() {
        return findElementByXpath("//span[text()='Get started for free']").isDisplayed();
    }

    public WebElement getButtonPaidCourses() {
        return driver.findElement(By.xpath("//a[@id='cert_navbtn']"));
    }

    public WebElement getButtonAddMultipleUsers() {
        return findElementByXpath("//a[@class='btn btn-info btn-lg btn-action-light']");
    }

    public WebElement getButtonSubmitARequest() {
        return findElementByXpath("//a[@class='submit-a-request']");
    }

    public WebElement getLinkW3School() {
        return findElementByXpath("//li/a[contains(text(),'W3Schools.com')]");
    }

    public WebElement getInputSearch() {
        return findElementByXpath("//input[@id='search2']");
    }

    public WebElement getButtonSearch() {
        return findElementByXpath("//i[@id='learntocode_searchicon']");
    }

    public WebElement getButtonJava() {
        return findElementByXpath("//a[@title='Java Tutorial']");
    }

    public WebElement getButtonConstruktor() {
        return findElementByXpath("//a[contains(text(),'Java Constructors')]");
    }

    public boolean getButtonPrevious() {
        return driver.findElement(By.xpath("//a[@class='w3-left w3-btn']")).isDisplayed();
    }

    public boolean getHtmlExample() {
        return driver.findElement(By.xpath("//div[@class='w3-code htmlHigh notranslate green-border']")).isDisplayed();
    }
    public WebElement getButtonWebSite() {
        return driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-item-hover w3-right w3-hide-small barex ws-pink']"));
    }

    public boolean getButtonStartedForFree() {
        return findElementByXpath("//button[@class='_1VfsI _OD95i _3_H0V mobb']").isDisplayed();
    }

    public WebElement getButtontutorials() {
        return findElementByXpath("//a[@id='navbtn_tutorials']");
    }

    public WebElement getButtonlearnCSS() {
        return findElementByXpath("//a[contains(text(),'Learn CSS')]");
    }

    public boolean getButtonHome() {
        return findElementByXpath("//a[@class='w3-left w3-btn']").isDisplayed();
    }

    public WebElement getButtonReferences() {
        return findElementByXpath("//a[@id='navbtn_references']");
    }

    public WebElement getButtonVideoTutorials() {
        return findElementByXpath("//a[@class='w3-button ws-yellow tut-button ws-yellow-hover']");
    }

    public boolean getButtonBuyVideo() {
        return driver.findElement(By.xpath("//a[@id='planbox']")).isDisplayed();
    }

    public WebElement getButtonPlaygame() {
        return driver.findElement(By.xpath("//a[@class='w3-button tut-button black-color']"));
    }

    public boolean getButtonPlayCode() {
        return findElementByXpath("//a[@class='w3-button tut-button black-color']").isDisplayed();
    }

    public WebElement getButtonExertisses() {

        return driver.findElement(By.xpath("//a[@id='navbtn_exercises']"));
    }

    public boolean getButtonExercises() {
        return findElementByXpath("//a[@style='width:155px;font-size:21px']").isDisplayed();
    }

    public boolean getButtonQuizzes() {
        return findElementByXpath("//a[@style='width:135px;font-size:21px']").isDisplayed();
    }

    public boolean getButtonCourses() {
        return findElementByXpath("//a[@style='width:135px;font-size:21px']").isDisplayed();
    }

    public boolean getButtonCertificates() {
        return findElementByXpath("//a[@style='width:150px;font-size:21px']").isDisplayed();
    }

    public WebElement getButtonVideos() {
        return findElementByXpath("//a[@title='Video Tutorials']");
    }

    public boolean getButtonCookie() {
        return findElementByXpath("//a[contains(text(),'Cookie')]").isDisplayed();
    }
}

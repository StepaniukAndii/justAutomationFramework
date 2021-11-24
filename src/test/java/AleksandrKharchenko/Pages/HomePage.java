package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateHome() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getSignInLink() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement getCityLosAngeles() {
        return driver.findElement(By.xpath("//a[contains(text(),'Los Angeles, CA')]"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
    }

    public void navigateHomeQa2() {
        driver.get("https://qa2.eatstreet.com/");
    }

    public WebElement getMyAccountLink() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }

    public WebElement getGetTheAppLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Get The App')]"));
    }

    public WebElement getAddressField() {
        return driver.findElement(By.xpath("//input[contains(@class,'enter-address__input')]"));
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//div[contains(@class,'modal-footer')]/a"));
    }

    public void checkAndClosePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            getSearchAttempt().get(1).click();
        }
    }

    public WebElement getApplyNowLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Apply Now')]"));
    }

    public WebElement getAboutUsLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='about-us']"));
    }

    public WebElement getCareersLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));
    }

    public WebElement getContactUsLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement getVegasCityLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Las Vegas, NV')]"));
    }

    public WebElement getTakeoutBtn() {
        return driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']"));
    }

    public WebElement getRestaurantDashboardLink() {
        return driver.findElement(By.xpath("//a[@ng-click='linkToDashboardSupport()']"));
    }

    public WebElement getTermsOfUse() {
        return driver.findElement(By.xpath("//a[@ui-sref='terms']"));
    }

    public WebElement getForCustomersLink() {
        return findElementByXpath("//a[contains(text(),'For Customers')]");
    }

    public WebElement getLinkSignUp() {
        return findElementByXpath("//button[contains(@class,'authentication__button--register')]");
    }

    public WebElement getNameField() {
        return findElementByXpath("//input[@id='v-register-name']");
    }

    public WebElement getSignUpBtn() {
        return findElementByXpath("//button[@name='send']");
    }

    public WebElement getEmailField() {
        return findElementByXpath("//input[@id='v-register-email']");
    }

    public WebElement getPasswordField() {
        return findElementByXpath("//input[@id='vregister-password']");
    }

    public WebElement getErrorPhoneMSG() {
        return findElementByXpath("//span[contains(text(),'для заповнення.')]");
    }

    public WebElement getFieldPhone() {
        return findElementByXpath("//input[@id='v-register_telephone_number']");
    }

    public List<WebElement> getErrorSignUpMSG() {
        return findElementsByXpath("//span[contains(text(),'для заповнення.')]");
    }

    public WebElement getSignInAlloLink() {
        return findElementByXpath("//button[@class='authentication__button--login']");
    }

    public WebElement getLoginFieldSignInAllo() {
        return findElementByXpath("//input[@id='auth']");
    }

    public WebElement getPasswordFieldSignInAllo() {
        return findElementByXpath("//input[@id='v-login-password']");
    }

    public WebElement getEnterBtnSignInAllo() {
        return findElementByXpath("//button[@type='button' and contains(text(),'Вхід')]");
    }

    public WebElement getUserName() {
        return findElementByXpath("//div[@id='account-top-name']");
    }

    public WebElement getLinkSignInWikipedia() {
        return findElementByXpath("//li[@id='pt-login']");
    }

    public WebElement getNameOfUser() {
        return findElementByXpath("//span[contains(text(),'Alex8xela')]");
    }

    public WebElement getSearchFieldWikipedia() {
        return findElementByXpath("//input[@id='searchInput']");
    }

    public WebElement getCreateArticleBtn() {
        return findElementByXpath("//span[contains(text(),'Создать статью')]");
    }

    public WebElement getUkraineLanguageLink() {
        return findElementByXpath("//a[@lang='uk']");
    }

    public WebElement getTextOnUkraineMSG() {
        return findElementByXpath("//span[@id='Ласкаво_просимо_до_Вікіпедії,']");
    }

    public WebElement getSettingsLink() {
        return findElementByXpath("//span[contains(text(),'Настройки')]");
    }

    public WebElement getHomePageLink() {
        return findElementByXpath("//span[contains(text(),'Заглавная страница')]");
    }

    public WebElement getRubricationLink() {
        return findElementByXpath("//span[contains(text(),'Рубрикация')]");
    }

    public WebElement getIndexLink() {
        return findElementByXpath("//span[contains(text(),'Указатель А — Я')]");
    }

    public WebElement getFeaturedArticlesLink() {
        return findElementByXpath("//span[contains(text(),'Избранные статьи')]");
    }

    public WebElement getRandomPageLink() {
        return findElementByXpath("//span[contains(text(),'Случайная страница')]");
    }

    public WebElement getCurrentEventsLink() {
        return findElementByXpath("//a[@title='Статьи о текущих событиях в мире']");
    }
}
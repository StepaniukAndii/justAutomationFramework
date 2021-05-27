package RozetkaSergey.UkrNetPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrNetPages extends BasePage {
    public UkrNetPages(WebDriver driver) {super(driver);}
    public void enterToUkrNet (String site) {this.driver.get(site);}
    public WebElement searchFieldWindow (){return findElementByXpath("//input[@id='search-input']");}
    public List<WebElement> listOfRequest () {return findElementsByXpath("//a[@class='gs-title']");}
    public WebElement buttonGoLogo (){return findElementByXpath("//a[@class='sLogo'] ");}
    public WebElement buttonСhangeCity (){return findElementByXpath("//a[@class='otherCity']");}
    public WebElement searchInUkraine(){return findElementByXpath("//div[@class='dropdown']//a");}
    public WebElement ukraineLanguageButton(){return findElementByXpath("//section[@class='top-bar']");}
    public WebElement postInUkraineOrRussian(){return findElementByXpath("//input[@value='Пошук']"); }
    public WebElement searchInRussian(){return findElementByXpath("//input[@value='Поиск']");}
    public WebElement buttonCurrencyExchange(){return findElementByXpath("//ul[@class='right-tabs__nav d-clear']//li[2]");}
    public List<WebElement> listOfMoney (){return findElementsByXpath("//div[@class='right-tabs__tab-body right-tabs__currency']//div[@class='right-tabs__currency--courses d-clear']//td[@class='purchase']");}
    public WebElement toEndOfTheFirstPage (){return findElementByXpath("//span[@itemprop='name']");}
    public WebElement loginField (){return findElementByXpath("//input[@id='id-input-login']");}
    public WebElement passField (){return findElementByXpath("//input[@id='id-input-password']");}
    public WebElement enterToUkrNet(){return findElementByXpath("//button[@class='form__submit']");}
    public WebElement makeNewAccount (){return findElementByXpath("//div[@class='form__navigation']//a[@class='form__link']");}
    public WebElement newNameForAccountField (){return findElementByXpath("//input[@id='id-login']");}
    public WebElement newPassField (){return findElementByXpath("//input[@id='id-password']");}
    public WebElement repeatPassField (){return findElementByXpath("//input[@id='id-password-repeat']");}
    public WebElement firstNameField (){return findElementByXpath("//input[@id='id-first-name']");}
    public WebElement secondNameField (){return findElementByXpath("//input[@placeholder='Прізвище']");}
    public WebElement dateOfMonth (){return findElementByXpath("//input[@id='id-birth-day']");}
    public WebElement year (){return findElementByXpath("//input[@placeholder='рік']");}
    public List<WebElement> sexRadioButton (){return findElementsByXpath("//label[@class='radio__imitator']");}
    public WebElement buttonFastToTop (){return findElementByXpath("//a[@id='go-top']");}
    public WebElement cityName(){return findElementByXpath("//div[@class='Name']");}
    public WebElement fieldForSearchCity (){return findElementByXpath("//input[@id='searchInput']");}
    public WebElement supportCustomer(){return findElementByXpath("//a[text()='Підтримка користувачів']");}
    public WebElement ukrtelecomNumber(){return findElementByXpath("//li[@class='utel']");}
    public WebElement buttonAdvertisementOnSite(){return findElementByXpath("//footer//a[@target='_blank']");}
    public WebElement copyWriteSign(){return findElementByXpath("//span[@style ='padding-right:35px;']");}
    public WebElement locatorOfCovidIframe (){return findElementByXpath("//iframe[@id='covidF']");}
    public List<WebElement> statisticInWorld (){return findElementsByXpath("//div[@class='cov_tab_name translate_js']");}
    public List<WebElement> listOfAllIframeAtPage(){return findElementsByXpath("//iframe[@sandbox='allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation']");}


}

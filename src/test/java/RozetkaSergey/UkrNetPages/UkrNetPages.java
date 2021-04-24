package RozetkaSergey.UkrNetPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrNetPages extends BasePage {
    public UkrNetPages(WebDriver driver) {super(driver);}
    public void enterToUkrNet (String site) {this.driver.get(site);}
    public WebElement searchFieldWindow (){return getElement("//input[@id='search-input']");}
    public List<WebElement> listOfRequest () {return getElements("//a[@class='gs-title']");}
    public WebElement buttonGoLogo (){return getElement("//a[@class='sLogo'] ");}
    public WebElement buttonСhangeCity (){return getElement("//a[@class='otherCity']");}
    public WebElement searchInUkraine(){return getElement("//div[@class='dropdown']//a");}
    public WebElement ukraineLanguageButton(){return getElement("//section[@class='top-bar']");}
    public WebElement postInUkraineOrRussian(){return getElement("//input[@value='Пошук']"); }
    public WebElement searchInRussian(){return getElement("//input[@value='Поиск']");}
    public WebElement buttonCurrencyExchange(){return getElement("//ul[@class='right-tabs__nav d-clear']//li[2]");}
    public List<WebElement> listOfMoney (){return getElements("//div[@class='right-tabs__tab-body right-tabs__currency']//div[@class='right-tabs__currency--courses d-clear']//td[@class='purchase']");}
    public WebElement toEndOfTheFirstPage (){return getElement("//span[@itemprop='name']");}
    public WebElement loginField (){return getElement("//input[@id='id-input-login']");}
    public WebElement passField (){return getElement("//input[@id='id-input-password']");}
    public WebElement enterToUkrNet(){return getElement("//button[@class='form__submit']");}
    public WebElement makeNewAccount (){return getElement("//div[@class='form__navigation']//a[@class='form__link']");}
    public WebElement newNameForAccountField (){return getElement("//input[@id='id-login']");}
    public WebElement newPassField (){return getElement("//input[@id='id-password']");}
    public WebElement repeatPassField (){return getElement("//input[@id='id-password-repeat']");}
    public WebElement firstNameField (){return getElement("//input[@id='id-first-name']");}
    public WebElement secondNameField (){return getElement("//input[@placeholder='Прізвище']");}
    public WebElement dateOfMonth (){return getElement("//input[@id='id-birth-day']");}
    public WebElement year (){return getElement("//input[@placeholder='рік']");}
    public List<WebElement> sexRadioButton (){return getElements("//label[@class='radio__imitator']");}
    public WebElement buttonFastToTop (){return getElement("//a[@id='go-top']");}
    public WebElement cityName(){return getElement("//div[@class='Name']");}
    public WebElement fieldForSearchCity (){return getElement("//input[@id='searchInput']");}

}

package AlloTest;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageHomeAllo extends BasePage{

    public PageHomeAllo(WebDriver driver){
        super(driver);
    }

    public WebElement singIn(){
        return getElement ("//button[@class='authentication__button--login']");
    }

    public WebElement loginTab(){
        return getElement ("//div[@class='v-modal__cmp-body']//li[@class='login-tab']");
    }

    public WebElement enterName(){
        return getElement ("//input[@id='v-register-name']");
    }

    public WebElement enterNumber(){
        return getElement ("//input[@id='v-register_telephone_number']");
    }

    public WebElement enterEmail(){
        return getElement ("//input[@id='v-register-email']");
    }

    public WebElement enterPassword(){
        return getElement ("//input[@id='vregister-password']");
    }

    public WebElement logo(){
        return getElement("//div[@class='v-header__line v-header__line--second page-container main-header-second-line']/a[@class='header-logo__link']");
    }

    public WebElement categoriesClick(){
        return getElement ("//div[@class='main-header__categories']");
    }

    public WebElement telefonItems(){
        return getElement ("//li[@data-id='1516']");
    }

    public WebElement appLiancesItems(){
        return getElement("//li[@data-id='1907']");
    }

    public WebElement carsItems(){
        return getElement ("//li[@data-id='2228']");
    }

    public WebElement sportItems(){
        return getElement ("//li[@data-id='1962']");
    }

    public WebElement toolsItem(){
        return getElement ("//li[@data-id='2282']");
    }

    public WebElement serchFild(){
        return getElement ("//input[@id='search-form__input']");
    }

    public WebElement showPass(){
        return getElement ("//span[@class='password-eye']");
    }

    public WebElement buttonSerch(){
        return getElement ("//button[@class='search-form__submit-button search-form__submit-button--active']");
    }

    public WebElement oneItem(){
        return getElement ("//div[@class='products-layout__container products-layout--grid']/div[2]");
    }

    public WebElement buttonBay(){
        return getElement ("//button[@id='product-buy-button']");
    }

    public WebElement bayWindowClose(){
        return getElement ("//button[@class='comeback']");
    }

    public WebElement aLotOfItems(){
        return getElement ("//ul[@id='breadcrumbs']/li[2]");
    }

    public WebElement basked(){
        return getElement ("//div[@class='shopping-cart']");
    }

    public List<WebElement> itemListInBasked(){
        return  getElements ("//ul[@class='products__list']/li");
    }

    public WebElement citiesOpenFild() {return getElement ("//div[@class='geo-label js-geo-label']"); }

    public WebElement kiev() {return getElement ("//li[@data-geo-select-city='Киев']"); }

    public WebElement kharkov() {return getElement ("//li[@data-geo-select-city='Харьков']"); }

    public WebElement odessa() {return getElement ("//li[@data-geo-select-city='Одесса']"); }

    public WebElement dnipro() {return getElement ("//li[@data-geo-select-city='Днепр']"); }

    public WebElement lvov() {return getElement ("//li[@data-geo-select-city='Львов']"); }

    public WebElement zaporozhee() {return getElement ("//li[@data-geo-select-city='Запорожье']"); }

    public WebElement closeSpam() {return getElement ("//div[@class='geolocation__content geolocation__content--success geolocation__content--decoration geolocation']/*[name()='svg']");}

    public WebElement inputCitie() {return getElement ("//input[@id='city']");}

    public WebElement brovaryCitie(){return getElement ("//div[@data-geo-label='Бровары']");}

    public WebElement chengesLanguage(){return getElement ("//div[@class='language']/span/div");}

    public WebElement checkLanguage(){return getElement ("//div[@class='header-catalog-button']/p");}

}


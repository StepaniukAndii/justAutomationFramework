package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PageHomeAllo extends BasePage{

    public PageHomeAllo(WebDriver driver){
        super(driver);
    }

    public WebElement singIn(){
        return findElementByXpath("//button[@class='authentication__button--login']");
    }

    public WebElement loginTab(){
        return findElementByXpath("//div[@class='v-modal__cmp-body']//li[@class='login-tab']");
    }

    public WebElement enterName(){
        return findElementByXpath("//input[@id='v-register-name']");
    }

    public WebElement enterNumber(){
        return findElementByXpath("//input[@id='v-register_telephone_number']");
    }

    public WebElement enterEmail(){
        return findElementByXpath("//input[@id='v-register-email']");
    }

    public WebElement enterPassword(){
        return findElementByXpath("//input[@id='vregister-password']");
    }

    public WebElement logo(){
        return findElementByXpath("//div[@class='v-header__line v-header__line--second page-container main-header-second-line']/a[@class='header-logo__link']");
    }

    public WebElement categoriesClick(){
        return findElementByXpath("//div[@class='main-header__categories']");
    }

    public WebElement telefonItems(){
        return findElementByXpath("//li[@data-id='1516']");
    }

    public WebElement appLiancesItems(){
        return findElementByXpath("//li[@data-id='1907']");
    }

    public WebElement carsItems(){
        return findElementByXpath("//li[@data-id='2228']");
    }

    public WebElement sportItems(){
        return findElementByXpath("//li[@data-id='1962']");
    }

    public WebElement toolsItem(){
        return findElementByXpath("//li[@data-id='2282']");
    }

    public WebElement serchFild(){
        return findElementByXpath("//input[@id='search-form__input']");
    }

    public WebElement showPass(){
        return findElementByXpath("//span[@class='password-eye']");
    }

    public WebElement buttonSerch(){
        return findElementByXpath("//button[@class='search-form__submit-button search-form__submit-button--active']");
    }

    public WebElement oneItem(){
        return findElementByXpath("//div[@class='products-layout__container products-layout--grid']/div[2]");
    }

    public WebElement buttonBay(){
        return findElementByXpath("//button[@id='product-buy-button']");
    }

    public WebElement bayWindowClose(){
        return findElementByXpath("//button[@class='comeback']");
    }

    public WebElement aLotOfItems(){
        return findElementByXpath("//ul[@id='breadcrumbs']/li[2]");
    }

    public WebElement basked(){
        return findElementByXpath("//div[@class='shopping-cart']");
    }

    public List<WebElement> itemListInBasked(){
        return  findElementsByXpath("//ul[@class='products__list']/li");
    }
    public List<WebElement> closeButtonListInBasked(){
        return  findElementsByXpath("//div[@class='title']/*[name()='svg']");
    }

    public WebElement citiesOpenFild() {return findElementByXpath("//div[@class='geo-label js-geo-label']"); }

    public WebElement kiev() {return findElementByXpath("//li[@data-geo-select-city='Киев']"); }

    public WebElement kharkov() {return findElementByXpath("//li[@data-geo-select-city='Харьков']"); }

    public WebElement odessa() {return findElementByXpath("//li[@data-geo-select-city='Одесса']"); }

    public WebElement dnipro() {return findElementByXpath("//li[@data-geo-select-city='Днепр']"); }

    public WebElement lvov() {return findElementByXpath("//li[@data-geo-select-city='Львов']"); }

    public WebElement zaporozhee() {return findElementByXpath("//li[@data-geo-select-city='Запорожье']"); }

    public WebElement closeSpam() {return findElementByXpath("//div[@class='geolocation__content geolocation__content--success geolocation__content--decoration geolocation']/*[name()='svg']");}

    public WebElement inputCitie() {return findElementByXpath("//input[@id='city']");}

    public WebElement brovaryCitie(){return findElementByXpath("//div[@data-geo-label='Бровары']");}

    public WebElement chengesLanguage(){return findElementByXpath("//div[@class='language']/span/div");}

    public WebElement checkLanguage(){return findElementByXpath("//div[@class='header-catalog-button']/p");}

    public List<WebElement> blockPriceProduks(){
        return findElementsByXpath("//ul[@class='menu__list js-menu__list']/li/a");
    }
    public WebElement buttonArrowMous(){
        return findElementByXpath("//div[@class='menu js-menu menu--level-1']");
    }
    public List<WebElement> clickScroll(){
        return findElementsByXpath("//div[@class='home-banner__pagination']/button");
    }
    public WebElement nextButton(){
        return findElementByXpath("//button[@class='home-banner__nav-button home-banner__nav-button--next']");
    }
    public WebElement prevButton(){
        return findElementByXpath("//button[@class='home-banner__nav-button home-banner__nav-button--prev']");
    }
    public WebElement scrollArrowMous(){
        return findElementByXpath("//div[@id='tns1-iw']");
    }
    public WebElement mousToTwoItem(){return findElementByXpath("" +
            "//div[@class='products-layout__item without-options-1 without-options-3 without-options-4'][2]");}
}
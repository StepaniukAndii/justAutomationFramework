package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RozetkaPages5_34 extends BasePage {
    public String closeAdvertisementLocator = "//span[@class='exponea-close-cross']";

    public RozetkaPages5_34(WebDriver driver) {
        super(driver);
    }

    public WebElement closeAdverb() {
        return getElement("//span[@class='exponea-close-cross']");
    }

    public WebElement clickCatalog() {
        return getElement("//header[@class='header']//button[@aria-label='Каталог']");
    }

    public List<WebElement> goToMainMenu() {
        return getElements("//li[@class='side-menu__item']");
    }

    public List<WebElement> chooseComp() {
        return getElements("/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[1]/a");
    }

    public WebElement name(){
        return getElement("");
    }

    public List<WebElement> addToCard() {
        return getElements("//button[@class='buy-button goods-tile__buy-button']");
    }

    public WebElement cardDigit() {
        return getElement("//span[@class='counter counter--green']");
    }

    public void enterToRozetka(String site) {
        driver.get(site);
    }

    public WebElement goToBasket() {
        return getElement("//button[@class='header__button header__button--active']");
    }

    public WebElement clickButtonDelete() {
        return getElement("//button[@class='button button--white button--small context-menu__toggle']");
    }

    public WebElement affirmDelete() {
        return getElement("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button']");
    }
    public WebElement returnWords (){return getElement("//h4[@class='cart-dummy__heading']");}
    public List<WebElement> addMore (){ return getElements("//button[@class='button button_color_white button_size_medium cart-counter__button']");}
    public WebElement takePrice (){ return getElement("//div[@class='cart-receipt__sum-price']");}
    public WebElement takeSume (){ return getElement("//div[@class='cart-receipt__sum-price']");}
    public WebElement clickTopMenu (){return getElement("//button[@id='fat-menu']");}
    public WebElement clickOnLaptopAndComp () { return getElement("//div[@class='menu__hidden-column']//a[contains(text(),'Ноутбуки')]");}
    public List<WebElement> addToCompare (){return  getElements("//button[@class='compare-button']");}
    public List<WebElement> goToComparator (){return getElements("//button[@class='header__button' or contains(text(),'Списки сравнения')]  ");}
    public WebElement goWeiter (){return getElement("//a[@class='comparison-modal__link']");}
    public List<WebElement> likeButtons (){return getElements("//section[@class='content content_type_catalog']//button[@class='wish-button js-wish-button']");}
    public WebElement closeAdvertisement (){return getElement(closeAdvertisementLocator);}
    public WebElement listToleft (){return getElement("//button[@aria-label='Предыдущий слайд']");}
    public WebElement listToRight (){return getElement("//button[@aria-label='Следующий слайд']");}
    public WebElement clickOnThreeStrips (){return getElement("//button[@class='header__button'][contains(@aria-label, 'Открыть меню')]");}
    public WebElement chooseCity (){return  getElement("//button[@class='city-toggle button button--small button--white']");}
    public List<WebElement> listOfCites (){return getElements("//a[@class='header-location__popular-link']");}
    public WebElement klickAsept (){return getElement("//button[@class='button button_size_medium button_color_green']");}
    public WebElement changLanguageButton(){return getElement("//li[@class='lang__item __item']");}
    public WebElement fiendButton   () {return getElement("/html/body/app-root/div/div[1]/rz-header/header/div/div/div/form/button");}
    public WebElement contactButton (){ return getElement("//ul[@class='main-links__list']//a[@href='https://rozetka.com.ua/contacts/']");}
    public List<WebElement> listOfTelefonNumbers (){return getElements("//section[@class='contacts-section']//div[@class='contacts-main__cell']//a[@class='contacts-main__number']");}
    public WebElement supportButton (){return getElement("//div[@class='side-menu drawer-content drawer-content_state_visible']//button[@class='button button--large side-menu__button'][contains(text(),' Служба поддержки ')]");}
    public WebElement itIsWorking (){return getElement("//div[@class='modal__holder modal__holder_show_animation modal__holder_size_small']");}
    public WebElement enterIntoAccountButton(){return getElement("//rz-user[@class='header-actions__component']//button[@class='header__button']");}
    public WebElement setLoginField (){return getElement("//input[@id='auth_email']");}
    public WebElement setPasswordField (){return getElement("//input[@id='auth_pass']");}
    public  WebElement clickEnter (){ return getElement("//button[@class='button button--large button--green auth-modal__submit']");}
    public WebElement buttonBytovajaTexnika (){ return getElement("/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[4]/a");}
    public List<WebElement> listOfAllCatigorie (){return  getElements("//a[@class='menu-categories__link js-menu-categories__link']");}
    public WebElement buttonBoilrs (){return getElement("//a[@title='Водонагреватели (Бойлеры)']");}
    public List<WebElement> listOfBoilers (){return  getElements("//span[@class='goods-tile__title']");}
    public WebElement buttonPhotoOfBoiler(){return getElement("//a[contains(text(),' Фото ')]");}
    public WebElement isExistPhotoOfGood(){return getElement("//img[@class='product-photos__picture  ng-failed-lazyloaded ng-lazyloaded']");}
    public WebElement searchField(){return getElement("//input[@name='search']");}
    public  List<WebElement> listOfPrices (){return getElements("//div[@class='goods-tile__inner']//span[@class='goods-tile__price-value']");}
    public  List<WebElement> digitHowMuchInRozetka (){return getElements("//div[@data-filter-name='seller']//li[@class='checkbox-filter__item']//span[@class='sidebar-block__quantity']");}
    public List<WebElement> digitHowMushGoodsAtPage (){return getElements("//li[@class='catalog-grid__cell  catalog-grid__cell_type_slim']");}
    public WebElement brauneButton (){return getElement("//div[@data-filter-name='producer']//a[@class='checkbox-filter__link']//label[@for='Braun']");}
    public List<WebElement> listOfBraungoods(){return getElements("//div[@class='goods-tile__inner']//a[@class='goods-tile__heading']");}
    public List<WebElement> minMaxPrice (){ return getElements("//input[@class='slider-filter__input ng-untouched ng-pristine ng-valid']");}
    public WebElement buttonMinMaxPriceConfirm (){return getElement("//button[@class='button button_color_gray button_size_small slider-filter__button']");}
    public WebElement minArgu (){return getElement("//input[@formcontrolname='min']");}
    public WebElement maxArgu (){return getElement("//input[@formcontrolname='max']");}
    public WebElement othersSealersButton (){return getElement("//label[@for='Другие продавцы']");}
    public WebElement oneOfBrandButton (){return getElement("//label[@for='Clatronic']");}
    public WebElement goToStahl(){return getElement("//label[@for='Металл']");}
    public WebElement resetWhatWereChoose (){return getElement("//button[@class='catalog-selection__link catalog-selection__link_type_reset']");}
    public WebElement buttonUsedGood (){return getElement("//label[@for='Б/у']");}
    public  List<WebElement> listOfUsedWords (){return getElements("//span[@class='goods-tile__label promo-label promo-label_type_used']");}
    public WebElement buttonSmallArray (){return getElement("//button[@arial-label='Крупная плитка']");}
    public WebElement buttonLargeArray(){return getElement("//button[@arial-label='Малая плитка']");}
    public WebElement buttonMore60Goods (){return getElement("//a[@class='show-more show-more--horizontal']");}
    public List<WebElement> listOfAllGoodsAfterAddNew60 (){return getElements("//li[@class='catalog-grid__cell  catalog-grid__cell_type_slim']");}
}










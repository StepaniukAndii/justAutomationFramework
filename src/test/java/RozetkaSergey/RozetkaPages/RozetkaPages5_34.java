package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaPages5_34 extends BasePage {
    public String closeAdvertisementLocator = "//span[@class='exponea-close-cross']";

    public RozetkaPages5_34(WebDriver driver) {
        super(driver);
    }

    public WebElement closeAdverb() {
        return findElementByXpath("//span[@class='exponea-close-cross']");
    }

    public WebElement clickCatalog() {
        return findElementByXpath("//header[@class='header']//button[@aria-label='Каталог']");
    }

    public List<WebElement> goToMainMenu() {
        return findElementsByXpath("//li[@class='side-menu__item']");
    }

    public List<WebElement> chooseComp() {
        return findElementsByXpath("/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[1]/a");
    }

    public WebElement name(){
        return findElementByXpath("");
    }

    public List<WebElement> addToCard() {
        return findElementsByXpath("//button[@class='buy-button goods-tile__buy-button']");
    }

    public WebElement cardDigit() {
        return findElementByXpath("//span[@class='counter counter--green']");
    }

    public void enterToRozetka(String site) {
        driver.get(site);
    }

    public WebElement goToBasket() {
        return findElementByXpath("//button[@class='header__button header__button--active']");
    }

    public WebElement clickButtonDelete() {
        return findElementByXpath("//button[@class='button button--white button--small context-menu__toggle']");
    }

    public WebElement affirmDelete() {
        return findElementByXpath("//button[@class='button button--medium button--with-icon button--link context-menu-actions__button']");
    }
    public WebElement returnWords (){return findElementByXpath("//h4[@class='cart-dummy__heading']");}
    public List<WebElement> addMore (){ return findElementsByXpath("//button[@class='button button_color_white button_size_medium cart-counter__button']");}
    public WebElement takePrice (){ return findElementByXpath("//div[@class='cart-receipt__sum-price']");}
    public WebElement takeSume (){ return findElementByXpath("//div[@class='cart-receipt__sum-price']");}
    public WebElement clickTopMenu (){return findElementByXpath("//button[@id='fat-menu']");}
    public WebElement clickOnLaptopAndComp () { return findElementByXpath("//div[@class='menu__hidden-column']//a[contains(text(),'Ноутбуки')]");}
    public List<WebElement> addToCompare (){return  findElementsByXpath("//button[@class='compare-button']");}
    public List<WebElement> goToComparator (){return findElementsByXpath("//button[@class='header__button' or contains(text(),'Списки сравнения')]  ");}
    public WebElement goWeiter (){return findElementByXpath("//a[@class='comparison-modal__link']");}
    public List<WebElement> likeButtons (){return findElementsByXpath("//section[@class='content content_type_catalog']//button[@class='wish-button js-wish-button']");}
    public WebElement closeAdvertisement (){return findElementByXpath(closeAdvertisementLocator);}
    public WebElement listToleft (){return findElementByXpath("//button[@aria-label='Предыдущий слайд']");}
    public WebElement listToRight (){return findElementByXpath("//button[@aria-label='Следующий слайд']");}
    public WebElement getBurgerMenuButton(){return findElementByXpath("//button[@class='header__button'][contains(@aria-label, 'Открыть меню')]");}
    public WebElement chooseCity (){return  findElementByXpath("//button[@class='city-toggle button button--small button--white']");}
    public List<WebElement> listOfCites (){return findElementsByXpath("//a[@class='header-location__popular-link']");}
    public WebElement klickAsept (){return findElementByXpath("//button[@class='button button_size_medium button_color_green']");}
    public WebElement changLanguageButton(){return findElementByXpath("//li[@class='lang__item __item']");}
    public WebElement fiendButton   () {return findElementByXpath("/html/body/app-root/div/div[1]/rz-header/header/div/div/div/form/button");}
    public WebElement contactButton (){ return findElementByXpath("//ul[@class='main-links__list']//a[@href='https://rozetka.com.ua/contacts/']");}
    public List<WebElement> listOfTelefonNumbers (){return findElementsByXpath("//section[@class='contacts-section']//div[@class='contacts-main__cell']//a[@class='contacts-main__number']");}
    public WebElement supportButton (){return findElementByXpath("//div[@class='side-menu drawer-content drawer-content_state_visible']//button[@class='button button--large side-menu__button'][contains(text(),' Служба поддержки ')]");}
    public WebElement itIsWorking (){return findElementByXpath("//div[@class='modal__holder modal__holder_show_animation modal__holder_size_small']");}
    public WebElement enterIntoAccountButton(){return findElementByXpath("//rz-user[@class='header-actions__component']//button[@class='header__button']");}
    public WebElement setLoginField (){return findElementByXpath("//input[@id='auth_email']");}
    public WebElement setPasswordField (){return findElementByXpath("//input[@id='auth_pass']");}
    public  WebElement clickEnter (){ return findElementByXpath("//button[@class='button button--large button--green auth-modal__submit']");}
    public WebElement buttonBytovajaTexnika (){ return findElementByXpath("/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[4]/a");}
    public WebElement buttonBoilrs (){return findElementByXpath("//a[@title='Водонагреватели (Бойлеры)']");}
    public List<WebElement> listOfBoilers (){return  findElementsByXpath("//span[@class='goods-tile__title']");}
    public WebElement buttonPhotoOfBoiler(){return findElementByXpath("//a[contains(text(),' Фото ')]");}
    public WebElement isExistPhotoOfGood(){return findElementByXpath("//img[@class='product-photos__picture  ng-failed-lazyloaded ng-lazyloaded']");}
    public WebElement searchField(){return findElementByXpath("//input[@name='search']");}
    public  List<WebElement> listOfPrices (){return findElementsByXpath("//div[@class='goods-tile__inner']//span[@class='goods-tile__price-value']");}
    public  List<WebElement> digitHowMuchInRozetka (){return findElementsByXpath("//div[@data-filter-name='seller']//li[@class='checkbox-filter__item']//span[@class='sidebar-block__quantity']");}
    public List<WebElement> digitHowMushGoodsAtPage (){return findElementsByXpath("//li[@class='catalog-grid__cell  catalog-grid__cell_type_slim']");}
    public WebElement brauneButton (){return findElementByXpath("//div[@data-filter-name='producer']//a[@class='checkbox-filter__link']//label[@for='Braun']");}
    public List<WebElement> listOfBraungoods(){return findElementsByXpath("//div[@class='goods-tile__inner']//a[@class='goods-tile__heading']");}
    public List<WebElement> minMaxPrice (){ return findElementsByXpath("//input[@class='slider-filter__input ng-untouched ng-pristine ng-valid']");}
    public WebElement buttonMinMaxPriceConfirm (){return findElementByXpath("//button[@class='button button_color_gray button_size_small slider-filter__button']");}
    public WebElement minArgu (){return findElementByXpath("//input[@formcontrolname='min']");}
    public WebElement maxArgu (){return findElementByXpath("//input[@formcontrolname='max']");}
    public WebElement othersSealersButton (){return findElementByXpath("//label[@for='Другие продавцы']");}
    public WebElement oneOfBrandButton (){return findElementByXpath("//label[@for='Clatronic']");}
    public WebElement goToStahl(){return findElementByXpath("//label[@for='Металл']");}
    public WebElement resetWhatWereChoose (){return findElementByXpath("//button[@class='catalog-selection__link catalog-selection__link_type_reset']");}
    public WebElement buttonUsedGood (){return findElementByXpath("//label[@for='Б/у']");}
    public  List<WebElement> listOfUsedWords (){return findElementsByXpath("//span[@class='goods-tile__label promo-label promo-label_type_used']");}
    public WebElement buttonSmallArray (){return findElementByXpath("//button[@arial-label='Крупная плитка']");}
    public WebElement buttonLargeArray(){return findElementByXpath("//button[@arial-label='Малая плитка']");}
    public WebElement buttonMore60Goods (){return findElementByXpath("//a[@class='show-more show-more--horizontal']");}
    public List<WebElement> listOfAllGoodsAfterAddNew60 (){return findElementsByXpath("//li[@class='catalog-grid__cell  catalog-grid__cell_type_slim']");}
    public WebElement selectButton (){return findElementByXpath("select-css ng-pristine ng-valid ng-touched");}
    public WebElement selectorFromCheapToExpensive (){return findElementByXpath("//select[@class='select-css ng-pristine ng-valid ng-touched']//option[@value='1: cheap']");}
    public WebElement selectorFromExpensiveToCheap (){return findElementByXpath("//select[@class='select-css ng-pristine ng-valid ng-touched']//option[@value='2: expensive']");}

}









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

}










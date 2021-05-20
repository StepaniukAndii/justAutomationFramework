package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RozetkaPages1_4 extends BasePage {
    public RozetkaPages1_4 (WebDriver driver) {super(driver);}
    public void enterToRozetka (String site) {driver.get(site);}
    public List<WebElement> itTaksPunkteFromMenu (){return findElementsByXpath("//a[@class='menu-categories__link']");}
    public void littleTripThrowMenu () throws InterruptedException {
        int i;
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        for (i=0; i < rozetkaPages1_4.itTaksPunkteFromMenu().size(); i++){
            Actions actions = new Actions(driver);
            actions.moveToElement(rozetkaPages1_4.itTaksPunkteFromMenu().get(i)).perform();
            Thread.sleep(1000);
        }
    }
    public WebElement findSearchField (){return findElementByXpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");}
    public List<WebElement> getElementsConstructor() {
        return findElementsByXpath("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }
    public WebElement closeAdverb (){ return findElementByXpath("//span[@class='exponea-close-cross']");}
    public WebElement pickMainMenu (){ return findElementByXpath("//rz-mobile-user-menu[@class='header-menu']");}
    public List<WebElement> goToMainMenu(){return  findElementsByXpath("//li[@class='side-menu__item']");}
    public WebElement chooseComp (){return findElementByXpath("//a[text()=' Компьютеры, неттопы, моноблоки ']");}
    public List<WebElement> addToCard(){return  findElementsByXpath("//button[@class='buy-button goods-tile__buy-button']");}
    public WebElement cardDigit (){return  findElementByXpath("//span[@class='counter counter--green']");}



}

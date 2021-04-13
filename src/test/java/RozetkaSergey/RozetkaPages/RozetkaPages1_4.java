package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RozetkaPages1_4 extends BasePage {
    public RozetkaPages1_4 (WebDriver driver) {super(driver);}
    public void enterToRozetka (String site) {driver.get(site);}
    public List<WebElement> itTaksPunkteFromMenu (){return getElements("//a[@class='menu-categories__link']");}
    public void littleTripThrowMenu () throws InterruptedException {
        int i;
        RozetkaPages1_4 rozetkaPages1_4 = new RozetkaPages1_4(driver);
        for (i=0; i < rozetkaPages1_4.itTaksPunkteFromMenu().size(); i++){
            Actions actions = new Actions(driver);
            actions.moveToElement(rozetkaPages1_4.itTaksPunkteFromMenu().get(i)).perform();
            Thread.sleep(1000);
        }
    }
    public WebElement findSearchField (){return getElement("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");}
    public List<WebElement> getElementsConstructor() {
        return getElements("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }
    public WebElement closeAdverb (){ return getElement("//span[@class='exponea-close-cross']");}
    public WebElement pickMainMenu (){ return getElement("//rz-mobile-user-menu[@class='header-menu']");}
    public List<WebElement> goToMainMenu(){return  getElements("//li[@class='side-menu__item']");}
    public WebElement chooseComp (){return getElement("//a[text()=' Компьютеры, неттопы, моноблоки ']");}
}

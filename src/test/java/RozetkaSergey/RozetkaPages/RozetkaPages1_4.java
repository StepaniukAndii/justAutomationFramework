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

}

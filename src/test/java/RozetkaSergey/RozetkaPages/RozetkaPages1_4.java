package RozetkaSergey.RozetkaPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaPages1_4 extends BasePage {
    public RozetkaPages1_4 (WebDriver driver) {super(driver);}
    public void enterToRozetka (String site) {driver.get(site);}
    public List<WebElement> littleTripThrowMenu (){return getElements("//a[@class='menu-categories__link']");}

}

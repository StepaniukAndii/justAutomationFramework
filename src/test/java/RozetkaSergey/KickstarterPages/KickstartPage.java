package RozetkaSergey.KickstarterPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KickstartPage extends BasePage {
    public KickstartPage(WebDriver driver) {super(driver);}
    public void enterToKickStarter (String site ) {this.driver.get(site);}
    public List<WebElement> listElementsOfTopMenu (){return getElements("//ul[@class='flex justify-center-md text-nowrap']//li");}


}

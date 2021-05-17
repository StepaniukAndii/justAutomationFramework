package RozetkaSergey;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageVijar extends BasePage {
    public HomePageVijar(WebDriver driver) {
        super(driver);
    }
    public void enterToVijar(String site) {
        driver.get(site);
    }
    public WebElement closeAdverb() {
        return findElementByXpath("//img[@src='/img/close_white-24px.svg']");
    }
    public WebElement clickOnStatusOfOrder() {return findElementByXpath("//a[@class='ico-services']");}
    public List<WebElement> getDigit () {return  findElementsByXpath("//div[@class='work_day filial_location']");}
}







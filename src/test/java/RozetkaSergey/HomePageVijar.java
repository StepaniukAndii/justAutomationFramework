package RozetkaSergey;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageVijar extends BasePage {
    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";

    public HomePageVijar(WebDriver driver) {
        super(driver);
    }

    public void enterToVijar(String site) {
        driver.get(site);
    }

    public WebElement closeAdverb() {
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }
    public WebElement clickOnStatusOfOrder() {return getElement("//a[@class='ico-services']");}
    public List<WebElement> getDigit () {return  getElements("//div[@class='work_day filial_location']");}

}







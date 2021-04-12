package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VijarPages5_8 extends BasePage {
    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";
    public int counter = 0;

    public VijarPages5_8 (WebDriver driver) {
        super(driver);
    }
    public void enterToVijar(String site) {
        driver.get(site);
    }

    public WebElement closeAdverb() {
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }

    public void enterToGoogle(String site) {
        driver.get(site);
    }
    public WebElement findSearchFiel (){ return getElement("//input[@id='title-search-input']");}
    public WebElement clickOnFind (){ return getElement("//input[@name='s' and @value='Найти' ]");}
    public List<WebElement> getElementsEgger(){return getElements("//div[@class='product_prewiew']/a");}
    public WebElement clickToOpenFindPhonNumber (){return getElement("//*[@id=\"site_panel\"]/header/nav[2]/ul/li[7]/a");}
    public WebElement chosePhone () {return getElement("//p[@class='work_time']//a[@class='c-tel']");}
    public WebElement switchToUa() { return getElement("//a[@href='/ua/']");}


}

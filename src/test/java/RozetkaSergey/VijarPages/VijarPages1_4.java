package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VijarPages1_4 extends BasePage {

    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";
    public int counter = 0;

    public VijarPages1_4(WebDriver driver) {
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

    public WebElement googleField() {
        return getElement("//input[@class='gLFyf gsfi']");
    }

    public WebElement goToVijar() {
        return getElement(
                "//*[@class='LC20lb DKV0Md' and text()='Вияр - интернет-магазин мебельной фурнитуры. Все ...']");
    }

    public WebElement goToEnter() {
        return getElement("//div[@class='login-in']//a[@id='modal_ancor']");
    }

    public WebElement getLogin() {
        return getElement("//input[@class='flat_input login']");
    }

    public String getterLogin() {
        return login;
    }

    public WebElement getPass() {
        return getElement("//input[@class='flat_input password']");
    }

    public String getterPass() {
        return pass;
    }

    public WebElement clickEnter() {
        return getElement("//input[@class='login_btn']");
    }

    public WebElement switchToUa() {
        return getElement("//a[@href='/ua/']");
    }

    public WebElement newsHeaderElement() {
        return getElement("//nav[contains(@class, 'top-menu')]//a[@href='/ua/news/']");
    }

    public WebElement clickAtToolbar() {
        return getElement("//li[@class='item0']");
    }

    public WebElement clickToDSP() {
        return getElement("//a[@href='/catalog/dsp/' and text()='ДСП']");
    }

    public WebElement itemForCompareOne() {
        return getElement("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item'][1]//div[@class='compare_button']");
    }

    public WebElement itemForCompareTwo() {
        return getElement("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item'][2]//div[@class='compare_button']");
    }

    public WebElement itemCounter() {
        return getElement("//div[@class='back-comp']//span");
    }

    public WebElement goToCompare() {
        return getElement("//div[@class='back-comp']//span");
    }
    public WebElement topBar1 (){counter++; return  getElement("//li[@class='item0']");}
    public WebElement topBar2 (){counter++; return  getElement("//li[@class='item1']");}
    public WebElement topBar3 (){counter++; return  getElement("//li[@class='item2']");}
    public WebElement topBar4 (){counter++; return  getElement("//li[@class='item3']");}
    public WebElement topBar5 (){counter++; return  getElement("//li[@class='item4']");}
    public WebElement topBar6 (){counter++; return  getElement("//li[@class='item5']");}
    public WebElement topBar7 (){counter++; return  getElement("//li[@class='item6']");}
    public WebElement topBar8 (){counter++; return  getElement("//li[@class='item7']");}
}

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
        return findElementByXpath("//img[@src='/img/close_white-24px.svg']");
    }

    public void enterToGoogle(String site) {
        driver.get(site);
    }

    public WebElement googleField() {
        return findElementByXpath("//input[@class='gLFyf gsfi']");
    }

    public WebElement goToVijar() {
        return findElementByXpath(
                "//*[@class='LC20lb DKV0Md' and text()='Вияр - интернет-магазин мебельной фурнитуры. Все ...']");
    }

    public WebElement goToEnter() {
        return findElementByXpath("//div[@class='login-in']//a[@id='modal_ancor']");
    }

    public WebElement getLogin() {
        return findElementByXpath("//input[@class='flat_input login']");
    }

    public String getterLogin() {
        return login;
    }

    public WebElement getPass() {
        return findElementByXpath("//input[@class='flat_input password']");
    }

    public String getterPass() {
        return pass;
    }

    public WebElement clickEnter() {
        return findElementByXpath("//input[@class='login_btn']");
    }

    public WebElement switchToUa() {
        return findElementByXpath("//a[@href='/ua/']");
    }

    public WebElement newsHeaderElement() {
        return findElementByXpath("//nav[contains(@class, 'top-menu')]//a[@href='/ua/news/']");
    }

    public WebElement clickAtToolbar() {
        return findElementByXpath("//li[@class='item0']");
    }

    public WebElement clickToDSP() {
        return findElementByXpath("//a[@href='/catalog/dsp/' and text()='ДСП']");
    }

    public WebElement itemForCompareOne() {
        return findElementByXpath("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item'][1]//div[@class='compare_button']");
    }

    public WebElement itemForCompareTwo() {
        return findElementByXpath("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item'][2]//div[@class='compare_button']");
    }

    public WebElement itemCounter() {
        return findElementByXpath("//div[@class='back-comp']//span");
    }

    public WebElement goToCompare() {
        return findElementByXpath("//div[@class='back-comp']//span");
    }
    public WebElement topBar1 (){counter++; return  findElementByXpath("//li[@class='item0']");}
    public WebElement topBar2 (){counter++; return  findElementByXpath("//li[@class='item1']");}
    public WebElement topBar3 (){counter++; return  findElementByXpath("//li[@class='item2']");}
    public WebElement topBar4 (){counter++; return  findElementByXpath("//li[@class='item3']");}
    public WebElement topBar5 (){counter++; return  findElementByXpath("//li[@class='item4']");}
    public WebElement topBar6 (){counter++; return  findElementByXpath("//li[@class='item5']");}
    public WebElement topBar7 (){counter++; return  findElementByXpath("//li[@class='item6']");}
    public WebElement topBar8 (){counter++; return  findElementByXpath("//li[@class='item7']");}
}

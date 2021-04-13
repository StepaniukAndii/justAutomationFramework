package RozetkaSergey;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageVijar extends BasePage {
    private String login = "grinred69@gmail.com";
    private String pass = "23112010vi";
    public int counter = 0;

    public HomePageVijar(WebDriver driver) {
        super(driver);
    }

    public void enterToVijar(String site) {
        driver.get(site);
    }

    public WebElement closeAdverb() {
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }

    public WebElement ordering (){ return getElement("//div[@id='modal-addToCart']//div[@class='btn_buy']");}
    public WebElement deliteItemFromBasket () {return getElement("//img[@src='/images/viyarbox/close_little.png']");    }
    public WebElement getfromseitText(){return getElement("//td[@style='text-align:center']");}
    public WebElement clickOnStatusOfOrder() {return getElement("//a[@class='ico-services']");}
    public List<WebElement> getDigit () {return  getElements("//div[@class='work_day filial_location']");}
    public List<WebElement> clickAdvertisement(){ return getElements("/html/body/main/section/div[1]/div/div[1]/a[1]");}
    public WebElement topBar2 (){counter++; return  getElement("//li[@class='item1']");}
    public WebElement clickOnSamorezy (){ return getElement("//a[@href='/catalog/samorezy/']");}
    public List<WebElement> getItems (){return  getElements("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item']");}
    public List<WebElement> pickBuy (){return getElements("//a[@id='btn-buy-items']");}
    public List<WebElement> pickBuy2 (){return getElements("//a[@id='btn-buy-items']");}

}







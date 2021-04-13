package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class VijarPages9_12 extends BasePage {
    public int counter = 0;
    public VijarPages9_12(WebDriver driver) {super(driver);}
    public void enterToVijar(String site) {
        driver.get(site);
    }
    public WebElement closeAdverb() {
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }
    public WebElement topBar2 (){counter++; return  getElement("//li[@class='item1']");}
    public WebElement clickOnSamorezy (){ return getElement("//a[@href='/catalog/samorezy/']");}
    public List<WebElement> getItems (){return  getElements("//div[@class='col-xs-12 col-sm-6 col-md-6 col-lg-4 product_prewiew-wrapper paginator-item']");}
    public List<WebElement> pickBuy (){return getElements("//a[@id='btn-buy-items']");}
    public List<WebElement> pickBuy2 (){return getElements("//a[@id='btn-buy-items']");}
    public WebElement checkOut (){ return getElement("//*[@id=\"modal-addToCart\"]/div/div[3]/div[2]/a");}
    public WebElement addItemToCard (){return getElement("//a[@class='plus-button plus']");}
    public WebElement getPrice () { return getElement("//*[@id=\"site_panel\"]/section/section/div[2]/div[6]/div/div[1]/div/span[1]");}
    public WebElement getTheSecondPrice (){return getElement("//span[@class='current-price']");}
    public WebElement ordering (){ return getElement("//div[@id='modal-addToCart']//div[@class='btn_buy']");}
    public WebElement deliteItemFromBasket () {return getElement("//img[@src='/images/viyarbox/close_little.png']");    }
    public WebElement getfromseitText(){return getElement("//td[@style='text-align:center']");}
}


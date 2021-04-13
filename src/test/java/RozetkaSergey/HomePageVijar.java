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

    public WebElement goToEnter() {
        return getElement("//div[@class='login-in']//a[@id='modal_ancor']");
    }
    public WebElement getLogin() {
        return getElement("//input[@class='flat_input login']");
    }
    public WebElement getPass() {
         return getElement("//input[@class='flat_input password']");
    }
    public WebElement clickEnter() {
        return getElement("//input[@class='login_btn']");
    }
    public String getterPass() {
        return pass;
    }
    public WebElement topBar2 (){counter++; return  getElement("//li[@class='item1']");}

    public String getterLogin() {
        return login;
    }
    public WebElement switchToUa() { return getElement("//a[@href='/ua/']");}
    public WebElement newsHeaderElement() { return getElement("//nav[contains(@class, 'top-menu')]//a[@href='/ua/news/']");}
    public WebElement getSurname (){ return getElement("//input[@placeholder='Фамилия']");}
    public WebElement getName (){ return getElement("//input[@placeholder='Имя']");}
    public WebElement goToProfil(){return getElement("//div[@id='comp_3d516dd61c87243ff4c44464480b12fd']");}
    public WebElement getLog () { return getElement("//input[@placeholder='Логин']");}
    public WebElement getPassword() { return getElement("//input[@placeholder='Почтовый адрес']");}
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
    public WebElement clickOnStatusOfOrder() {return getElement("//a[@class='ico-services']");}
    public List<WebElement> getDigit () {return  getElements("//div[@class='work_day filial_location']");}
    public List<WebElement> clickAdvertisement(){ return getElements("/html/body/main/section/div[1]/div/div[1]/a[1]");}
}






package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LocatorsForPriceCheckTelefons extends BasePage {

    public LocatorsForPriceCheckTelefons(WebDriver driver) {
        super (driver);
    }
    public WebElement smartAndTelefons(){return getElement("//li[@data-id='1516']");}
    public WebElement telefons(){
        return getElement("//div[@class='portal-category']//li[@class='portal-category__item']/a[@href='/products/mobile/klass-kommunikator_smartfon/']");}
    public WebElement valuePriceOne(){return getElement("//input[@id='pricerange-from']");}
    public WebElement valuePriceTwo(){return getElement("//input[@id='pricerange-to']");}
    public WebElement showFilterTelefons(){return getElement("//button[@class='filter-popup__button']");}
    public List<WebElement> produktsTelefons() {
        return  getElements ("//div[@class='products-layout__container products-layout--grid']/div[@class='products-layout__item']");}
    public List<WebElement> priceTelefons(){
        return  getElements ("//div[@class='v-price-box__cur v-price-box__cur--discount']/span[@class='sum']");}
    public WebElement samsung(){return getElement("//a[@id='filter_id-847']");}
    public List<WebElement> listSamsung(){
        return getElements ("//div[@class='product-card__content']/a");}
}
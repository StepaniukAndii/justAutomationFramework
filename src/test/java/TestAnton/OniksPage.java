package TestAnton;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OniksPage extends BasePage {
    public OniksPage(WebDriver driver) {super(driver);}

    public WebElement searchField() {return findElementByXpath("//li//div[contains(@class,'search-wrap')]"); }
    public WebElement searchFieldLong() {return findElementByXpath("//ul//input[contains(@id,'title-search-input')]");}
    public WebElement backOnHomePageButton() {return findElementByXpath("//span[contains(text(),'ага')]");}
    public WebElement aboutUsBtnHeader() {return findElementByXpath("//nav//a[contains(text(),'ас')]");}
    public WebElement homePageLogoBtn() {return findElementByXpath("//a[contains(@class,'logo')]//child::img");}
    public WebElement textBlog() {return findElementByXpath("//h3[contains(text(),'ло')]");}
    public WebElement textReviews() {return findElementByXpath("//h3[contains(text(),'ывы')]");}
    public WebElement textOnlineJewelryStore() {return findElementByXpath("//h1[contains(text(),'ага')]");}
    public WebElement textSubscribeToOurInstagram() {return findElementByXpath("//span[contains(text(),'nsta')]");}
    public List<WebElement> itemsRings() {return findElementsByXpath("//div[contains(@class,'cat-item')]");}
    public WebElement addToFavoriteBtn() {return findElementByXpath("//span[contains(@class,'favo')]");}
    public WebElement goToFavoriteBtn() {return findElementByXpath("//a[contains(text(),'список')]");}
    public WebElement deleteFromFavoriteBtn() {return findElementByXpath("//a[contains(@class,'delete')]");}
    public WebElement textListEmpty() {return findElementByXpath("//font[contains(text(),'писок')]");}
    public WebElement languageWindow() {return findElementByXpath("//li[contains(@class,'active')]//child::a");}
    public WebElement textRULanguage() {return findElementByXpath("//a[contains(text(),'RU')]");}
    public WebElement textUALanguage() {return findElementByXpath("//a[contains(text(),'UA')]");}
    public WebElement wordCartOnUA() {return findElementByXpath("//a[contains(text(),'Кошик')]");}
    public WebElement wordCartOnRU() {return findElementByXpath("//a[contains(text(),'Корзина')]");}
    public List<WebElement> contextMenuOnHomePage() {return findElementsByXpath("//span[contains(@class,'dropdown-toggle')]");}
    public List<WebElement> collectionItems() {return findElementsByXpath("//a[contains(@class,'two-link')]//*[contains(text(),'крашен') or contains(text(),'оллекц') or contains(text(),'аспродажа')]");}
    public List<WebElement> itemsWithAmethyst() {return findElementsByXpath("//div[contains(@class,'cat-item')]");}
    public WebElement plusSomeItemsBtn() {return findElementByXpath("//div[contains(@id,'pagenav-button')]");}
    public WebElement allCollectionBtn() {return findElementByXpath("//a[contains(text(),'оллекции')]");}
    public WebElement filterKindOfDecorationBtn() {return findElementByXpath("//div[contains(text(),'ид')]");}
    public WebElement filterBraceletesInCollections() {return findElementByXpath("//span[@title='Браслеты ']");}
    public WebElement showBtn() {return findElementByXpath("//div[@id='modef']//child::a");}
    public List<WebElement> itemsBracelets() {return findElementsByXpath("//div[contains(@class,'cat-item')]");}
    public WebElement addToCartBtn() {return findElementByXpath("//button[contains(@class,'buy-button')]");}
    public WebElement closeCartAddedModal() {return findElementByXpath("//div[@id='basket_added_modal']//span[contains(@class,'close')]");}
    public WebElement cartBtn() {return findElementByXpath("//div[contains(@id,'blockcart-')]//child::li");}
    public WebElement nameOfTheChosenProduct() {return findElementByXpath("//ul[contains(@class,'itua_breadcrum')]//span[contains(text(),'ольцо')]");}
    public WebElement nameOfTheChosenProductInCart() {return findElementByXpath("//td[@class='item_name-wrapper']//a[contains(text(),'ольцо')]");}
    public List<WebElement> ringsNewPrice(){return findElementsByXpath("//div[contains(@id,'price')]//descendant::span[2]");}
    public WebElement priceBaseTo1000() {return findElementByXpath("//button[text()[normalize-space()='до 1 000 грн']]");}
}

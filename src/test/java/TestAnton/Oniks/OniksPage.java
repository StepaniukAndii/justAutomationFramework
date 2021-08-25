package TestAnton.Oniks;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OniksPage extends BasePage {
    public OniksPage(WebDriver driver) {super(driver);}

    public WebElement searchField() {return findElementByXpath("//ul//div[@class='search-wrap']"); }
    public WebElement searchFieldLong() {return findElementByXpath("//ul//input[@id='title-search-input']");}
    public WebElement backOnHomePageButton() {return findElementByXpath("//span[@itemprop='name']");}
    public WebElement aboutUsBtnHeader() {return findElementByXpath("//ul[@class='nav navbar-nav']//a[@href='/about/']");}
    public WebElement homePageLogoBtn() {return findElementByXpath("//img[@width='250']");}
    public WebElement textBlog() {return findElementByXpath("//h3[contains(text(),'Блог ')]");}
    public WebElement textReviews() {return findElementByXpath("//h3[text()='Отзывы']");}
    public WebElement textOnlineJewelryStore() {return findElementByXpath("//h1[text()='Интернет-магазин ювелирных изделий']");}
    public WebElement textSubscribeToOurInstagram() {return findElementByXpath("//span[text()='Подписывайтесь на наш Instagram:']");}
    public List<WebElement> itemsRings() {return findElementsByXpath("//div[@class='col-md-3 col-xs-6 cat-item search_item_block card-mod']");}
    public WebElement addToFavoriteBtn() {return findElementByXpath("//span[@class='favorites add-to-favourite']");}
    public WebElement goToFavoriteBtn() {return findElementByXpath("//a[contains(text(),'Перейти в список избранных')]");}
    public WebElement deleteFromFavoriteBtn() {return findElementByXpath("//a[@class='delete']");}
    public WebElement textListEmpty() {return findElementByXpath("//font[@class='notetext']");}
    public WebElement languageWindow() {return findElementByXpath("//a[@style='background-color: transparent;font-weight: bold;']");}
    public WebElement textRULanguage() {return findElementByXpath("//a[contains(text(),'RU')]");}
    public WebElement textUALanguage() {return findElementByXpath("//a[contains(text(),'UA')]");}
    public WebElement wordCartOnUA() {return findElementByXpath("//a[contains(text(),'Кошик')]");}
    public WebElement wordCartOnRU() {return findElementByXpath("//a[contains(text(),'Корзина')]");}
    public List<WebElement> contextMenuOnHomePage() {return findElementsByXpath("//span[@class='dropdown-toggle']");}
    public List<WebElement> collectionItems() {return findElementsByXpath("//a[contains(@class,'two-link')]//*[contains(text(),'крашен') or contains(text(),'оллекц') or contains(text(),'аспродажа')]");}
    public List<WebElement> itemsWithAmethyst() {return findElementsByXpath("//div[@class='col-md-4 col-xs-6 cat-item card-mod']");}
    public WebElement plusSomeItemsBtn() {return findElementByXpath("//div[@id='pagenav-button']");}
    public WebElement allCollectionBtn() {return findElementByXpath("//a[contains(text(),'ВСЕ Коллекции')]");}
    public WebElement filterKindOfDecorationBtn() {return findElementByXpath("//div[text()[normalize-space()='Вид украшения']]");}
    public WebElement filterBraceletesInCollections() {return findElementByXpath("//span[@title='Браслеты ']");}
    public WebElement showBtn() {return findElementByXpath("//div[@id='modef']//child::a");}
    public List<WebElement> itemsBracelets() {return findElementsByXpath("//div[contains(@class,'col-md-4 col-xs-6 cat-item card-mod')]");}
    public WebElement addToCartBtn() {return findElementByXpath("//button[@class='buy buy-button']");}
    public WebElement closeCartAddedModal() {return findElementByXpath("//div[@id='basket_added_modal']//span[@data-dismiss='modal']");}
    public WebElement cartBtn() {return findElementByXpath("//div[@id='blockcart-mobile']//*[contains(text(),'Корзина')]");}
    public WebElement nameOfTheChosenProduct() {return findElementByXpath("//ul[contains(@class, 'itua_breadcrum')]//span[contains(text(), 'ольцо')]");}
    public WebElement nameOfTheChosenProductInCart() {return findElementByXpath("//td[@class='item_name-wrapper']//a[contains(text(),'ольцо')]");}
    public WebElement priceBaseTo1000() {return findElementByXpath("//button[text()[normalize-space()='до 1 000 грн']]");}
    public List<WebElement> ringsNewPrice(){return findElementsByXpath("//div[contains(@id,'price')]//descendant::span[2]");}
    public WebElement getTextOnAboutUsPage(){
        return findElementByXpath("//span[contains(text(),'ннос')]");
    }

    public WebElement getDeliveryAndPaymentBtn(){
        return driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav')]/descendant::a[2]"));
    }

    public WebElement getTextOnDeliveryAndPaymentPage(){
        return findElementByXpath("//div[contains(@class,'container content-wrapper')]/descendant::span[2]");
    }
}

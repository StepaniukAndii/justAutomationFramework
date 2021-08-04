package TestAnton;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OniksPage extends BasePage {
    public OniksPage(WebDriver driver) {super(driver);}

    public WebElement searchField() {return findElementByXpath("//ul//div[@class='search-wrap']"); }
    public WebElement searchFieldLong() {return findElementByXpath("//ul//input[@id='title-search-input']");}
    public WebElement backOnHomePageButton() {return findElementByXpath("//span[@itemprop='name']");}
    public WebElement aboutUsBtnHeader() {return findElementByXpath("//ul[@class='nav navbar-nav']" +
            "//a[@href='/about/']");}
    public WebElement homePageLogoBtn() {return findElementByXpath("//img[@width='250']");}
    public WebElement textBlog() {return findElementByXpath("//h3[contains(text(),'Блог ')]");}
    public WebElement textReviews() {return findElementByXpath("//h3[text()='Отзывы']");}
    public WebElement textOnlineJewelryStore() {return findElementByXpath("//h1[text()='Интернет-магазин " +
            "ювелирных изделий']");}
    public WebElement textSubscribeToOurInstagram() {return findElementByXpath("//span[text()='Подписывайтесь на " +
            "наш Instagram:']");}
    public List<WebElement> itemsRings() {return findElementsByXpath("//div[@class='col-md-3 col-xs-6 cat-item " +
            "search_item_block card-mod']");}
    public WebElement addToFavoriteBtn() {return findElementByXpath("//span[@class='favorites " +
            "add-to-favourite']");}
    public WebElement goToFavoriteBtn() {return findElementByXpath("//a[contains(text(),'Перейти в список " +
            "избранных')]");}
    public WebElement deleteFromFavoriteBtn() {return findElementByXpath("//a[@class='delete']");}
    public WebElement textListEmpty() {return findElementByXpath("//font[@class='notetext']");}
    public WebElement languageWindow() {return findElementByXpath("//a[@style='background-color: transparent;" +
            "font-weight: bold;']");}
    public WebElement textRULanguage() {return findElementByXpath("//a[contains(text(),'RU')]");}
    public WebElement textUALanguage() {return findElementByXpath("//a[contains(text(),'UA')]");}
    public WebElement wordCartOnUA() {return findElementByXpath("//a[contains(text(),'Кошик')]");}
    public WebElement wordCartOnRU() {return findElementByXpath("//a[contains(text(),'Корзина')]");}
    public List<WebElement> contextMenuOnHomePage() {return findElementsByXpath("//span[@class=" +
            "'dropdown-toggle']");}
    public List<WebElement> collectionItems() {return findElementsByXpath("//span[contains(text(),'Украшения') " +
            "or contains(text(),'Коллекция') or contains(text(),'Распродажа')]");}
    public List<WebElement> itemsWithAmethyst() {return findElementsByXpath("//div[@class='col-md-4 col-xs-6 " +
            "cat-item card-mod']");}
    public WebElement plusSomeItemsBtn() {return findElementByXpath("//div[@id='pagenav-button']");}
    public List<WebElement> ringsNewPrice(){return findElementsByXpath("//div[@class='price']" +
            "//descendant::span[2]");}
    public WebElement priceBaseTo1000() {return findElementByXpath("//button[text()[normalize-space()='до " +
            "1 000 грн']]");}
    public WebElement allCollectionBtn() {return findElementByXpath("//a[contains(text(),'ВСЕ Коллекции')]");}
    public WebElement filterKindOfDecorationBtn() {return findElementByXpath("//div[text()[normalize-space()=" +
            "'Вид украшения']]");}
    public WebElement filterBraceletesInCollections() {return findElementByXpath("//span[@title='Браслеты ']");}
    public WebElement showBtn() {return findElementByXpath("//div[@id='modef']//child::a");}
    public List<WebElement> itemsBracelets() {return findElementsByXpath("//a[@class='js_save-element' and " +
            "contains(text(),'браслет') or @class='js_save-element' and contains(text(),'Браслет')]");}
    public WebElement addToCartBtn() {return findElementByXpath("//button[@class='buy buy-button']");}
    public WebElement closeCartAddedModal() {return findElementByXpath("//div[@id='basket_added_modal']" +
            "//child::div//child::div//child::div//child::span");}
    public WebElement cartBtn() {return findElementByXpath("//div[@id='blockcart-mobile']//child::div//child::ul" +
            "//child::li//child::a");}
    public WebElement nameOfTheChosenProduct() {return findElementByXpath("//h1[contains(text(),'Серебряное " +
            "кольцо с жемчугом и фианитами 1801/1р-PWT')]");}
    public WebElement nameOfTheChosenProductInCart() {return findElementByXpath("//a[contains(text()," +
            "'Серебряное кольцо с жемчугом и фианитами 1801/1р-PWT')]");}

}

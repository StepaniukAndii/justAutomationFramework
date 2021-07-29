package TestAnton;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OniksPage extends BasePage {
    public OniksPage(WebDriver driver) {super(driver);}

    public WebElement searchField() {return findElementByXpath("//ul//div[@class='search-wrap']");}
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
    public List<WebElement> itemsRings() {return findElementsByXpath("//div[@id='bx_3966226736_216669']" +
            "//div[@class='ware_item_holder']");}
    public WebElement addToFavoriteBtn() {return findElementByXpath("//span[@class='favorites " +
            "add-to-favourite']");}
    public WebElement goToFavoriteBtn() {return findElementByXpath("//a[contains(text(),'Перейти в список " +
            "избранных')]");}
    public WebElement deleteFromFavoriteBtn() {return findElementByXpath("//a[@class='delete']");}
    public WebElement textListEmpty() {return findElementByXpath("//font[@class='notetext']");}
}

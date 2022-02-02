package TestYurchik.LoraShen.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageLoraShen extends BasePage {
    public LandingPageLoraShen(WebDriver driver){super(driver);}

    public WebElement loraCart(){ return findElementByXpath("//a[contains(@class, 'cart-link')]"); }
    public WebElement floristiks(){ return findElementByXpath("//li[@id = 'shopbuketyi']"); }
    public WebElement floraTroyandi(){ return findElementByXpath("//a[contains(@href, 'kollektsiya-roz')]"); }
    public WebElement floraTulpany() { return findElementByXpath("//a[contains(@href, 'tulpanov')]"); }
    public WebElement sCollectionSumeer() { return findElementByXpath("//a[contains(@href, 'letnyaya-kollektsiya')][contains(@class, 'dropdown')]"); }
    public WebElement loveDayFlora() { return findElementByXpath("//a[contains(@href, 'den-vl')][contains(@class, 'dropdown')]"); }
    public WebElement womanGive() { return findElementByXpath("//a[contains(@href, 'jenska')][contains(@class, 'dropdown')]"); }
    public WebElement keramikaDD() { return  findElementByXpath("//li[contains(@id, 'keramika')][contains(@class, 'l2')]"); }
    public WebElement vlastneVyrobnytstvoOrch() { return  findElementByXpath("//a[contains(@href, 'shop-orkhideynitsa')]"); }
    public WebElement garderobVaz() { return findElementByXpath("//a[contains(@href, 'spirit')]"); }
    public WebElement mariaFoundation() { return findElementByXpath("//a[contains(@href, 'mareey')][contains(@class, 'dropdown')]"); }
    public WebElement podarynkiTab() { return findElementByXpath("//li[contains(@id, 'podarky')][contains(@class, 'l2')]"); }
    public WebElement candlesTab() { return findElementByXpath("//a[contains(@href, 'svechi')]"); }
    public WebElement statyetkiTab() { return findElementByXpath("//a[contains(@href, 'statyetki')]"); }
    public WebElement zhidkieDifuzori() { return findElementByXpath("//a[contains(@href, 'zhidkie-diffuzoru')]"); }
    public WebElement blackFridayLoraShen() { return findElementByXpath("//a[contains(@href, 'black')]"); }
    public WebElement rasteniyaLoraShen() { return findElementByXpath("//li[contains(@id, 'rasteniya')][contains(@class, 'dropdown')]"); }
    public WebElement orkhideyaRoslinyLoraShen() { return findElementByXpath("//a[contains(@href, 'shop-orkhidei/')][contains(@class, 'dropdown')]"); }
    public WebElement kashpoDlyaRoslin() { return findElementByXpath("//a[contains(@href, 'dla-rasteniy')]"); }
    public WebElement zimFloristics() { return findElementByXpath("//a[contains(@href, 'zimnyaya-flor')][contains(@class, 'drop')]"); }
    public WebElement newYearCollection() { return findElementByXpath("//li[contains(@id, 'new-year')]"); }
}

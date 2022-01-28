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
}

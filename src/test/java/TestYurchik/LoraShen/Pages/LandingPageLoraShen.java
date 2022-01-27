package TestYurchik.LoraShen.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageLoraShen extends BasePage {
    public LandingPageLoraShen(WebDriver driver){super(driver);}

    public WebElement LoraCart(){ return findElementByXpath("//a[contains(@class, 'cart-link')]"); }
    public WebElement floristiks(){ return findElementByXpath("//li[@id = 'shopbuketyi']"); }
    public WebElement floraTroyandi(){ return findElementByXpath("//a[contains(text(), 'Троянди']"); }
}

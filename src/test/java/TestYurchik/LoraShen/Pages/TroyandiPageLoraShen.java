package TestYurchik.LoraShen.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TroyandiPageLoraShen extends BasePage {
    public TroyandiPageLoraShen(WebDriver driver){super(driver);}

    public WebElement troyandiZakaz(){ return findElementByXpath("//button[@data-id = '4412']"); }
    public WebElement filterBar() { return  findElementByXpath("//div[@id = 'js-filterbar-toggle']"); }
    public WebElement filterPriceTag() { return findElementByXpath("//label[@for = 'id_price_6']"); }
    public WebElement filterAcceptButton() { return findElementByXpath("//button[@form = 'filter_form']"); }
}

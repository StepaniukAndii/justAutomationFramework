package TestYurchik.LoraShen.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPageLoraShen extends BasePage {
    public CartPageLoraShen(WebDriver driver){super(driver);}

    public WebElement deleteZeroElement(){ return findElementByXpath("//a[@data-marker = '#id_items-0']"); }
    public List<WebElement> checkCartEmpty() { return findElementsByXpath("//div[@class = 'cart-slot__empty']"); }
    public List<WebElement> checkCartHasElement() { return findElementsByXpath("//span[contains(text(), '4412')]"); }
    public WebElement cartNameLine() { return findElementByXpath("//input [contains(@id, 'id_billing_detail_l')]"); }
    public WebElement cartEmailLine() { return findElementByXpath("//input[@id = 'id_billing_detail_email']"); }
    public WebElement cartMobilePhone() { return findElementByXpath("//input[@id = 'id_billing_detail_phone']"); }
    public WebElement cartMeBuyerCheckBox() { return findElementByXpath("//label[contains(@for, 'id_same')]"); }
    public WebElement cartSelectTime() { return findElementByXpath("//label[contains(@for, 'self-6')]"); }
    public WebElement cartCompleteOrder() { return findElementByXpath("//input[@name= 'complete_order'][@type = 'submit']"); }
    public WebElement cartSelectAdress() { return findElementByXpath("//label[contains(@for, 'addr1')]"); }
}

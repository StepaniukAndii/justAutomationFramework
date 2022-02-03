package TestYurchik.LoraShen.LoraShen.Pages;

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
    public WebElement cartEmailLine() { return findElementByXpath("//input[contains(@type,'email')]"); }
    public WebElement cartMobilePhone() { return findElementByXpath("//div[contains(@class,'customer')]//input[contains(@name,'phone')]"); }
    public WebElement cartMeBuyerCheckBox() { return findElementByXpath("//label[contains(@for, 'id_same')]"); }
    public WebElement cartSelectTime() { return findElementByXpath("//label[contains(@for, 'self-6')]"); }
    public WebElement cartCompleteOrder() { return findElementByXpath("//input[contains(@name, 'complete')][contains(@type, 'submit')]"); }
    public WebElement cartSelectAdress() { return findElementByXpath("//label[contains(@for, 'addr1')]"); }
    public List<WebElement> checkCartEmailInvalid() { return findElementsByXpath("//div[contains(@class, 'error')]"); }
    public WebElement cartIncreaseQuantityOfFirstElement() { return findElementByXpath("//span[contains(@class, 'plus')]"); }
    public List<WebElement> checkQuantityTwo() { return findElementsByXpath("//input[contains(@value, '2')][contains(@name, 'quantity')]"); }
    public WebElement cartNameOfDelivered () { return  findElementByXpath("//input[contains(@id, 'name')][contains(@name, 'ship')]"); }
    public WebElement cartPhoneOfDelivered () { return findElementByXpath("//input[contains(@id, 'phone')][contains(@name, 'ship')]"); }
    public List<WebElement> checkNameDeliveredError () { return findElementsByXpath("//div[contains(@class, 'error')]"); }
}
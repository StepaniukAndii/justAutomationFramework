package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaCompanyFoodPage extends BasePage{
    public PizzaCompanyFoodPage(WebDriver driver){super(driver);}

    public WebElement cheesygarlicbreadfood(){return findElementByXpath("//*[contains(text(),'Garlic Bread')]");}
    public WebElement addfoodbtn(){return findElementByXpath("//button[contains(@id,'add')]");}
    public WebElement addfoodtocartbtn(){return findElementByXpath("//a[contains(@id,'confirm')]");}
    public WebElement caesarsaladfood(){return findElementByXpath(" //span[contains(text(),'Caesar')]");}
    public WebElement ceasarsaladselectsizedroplist(){return findElementByXpath(" //select[contains(@id,'main')]");}
    public WebElement ceasarsaladselectlargesize(){return findElementByXpath(" //*[contains(text(),'Large')]");}
    public WebElement ceasarsaladchoiceofdressingitalian(){return findElementByXpath(" //input[contains(@id,'86746786')]");}
    public WebElement cheeseburgerfood(){return findElementByXpath(" //*[contains(text(),'Cheeseburger')]");}
    public WebElement cheeseburgercookstylemediumwell(){return findElementByXpath(" //input[contains(@id,'23333261')]");}
    public WebElement cheeseburgerchoiceofside(){return findElementByXpath(" //input[contains(@id,'23333253')]");}

}

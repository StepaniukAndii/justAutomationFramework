package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewYorkPizzaPastaPage extends BasePage{
    public NewYorkPizzaPastaPage(WebDriver driver){super(driver);}

    public WebElement chickenpizzapackfood(){return findElementByXpath("//*[contains(text(),'Chicken & ')]");}
    public WebElement baconpizzatoppingsfullbtn(){return findElementByXpath("//input[contains(@value,'134475669')]");}
    public WebElement saucechoiceforwingsbbqbtn(){return findElementByXpath("//input[contains(@id,'184899718')]");}
    public WebElement onthesideplaceforsaucebtn(){return findElementByXpath("//input[contains(@id,'184899723')]");}
    public WebElement addfoodtothecartbtn(){return findElementByXpath("//*[contains(text(),'Add to')]");}
    public WebElement orderaheadfoodbtn(){return findElementByXpath("//a[contains(@id,'click')]");}

}

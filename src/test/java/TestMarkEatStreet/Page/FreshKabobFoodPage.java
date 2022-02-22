package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreshKabobFoodPage extends BasePage{
    public FreshKabobFoodPage(WebDriver driver){super(driver);}
    public WebElement grilledsalmonfood(){return findElementByXpath("//*[contains(text(),'Grilled Salmon')]");}
    public WebElement addtocartbtn(){return findElementByXpath("//*[contains(text(),'Add to Cart')]");}
    public WebElement grilledchickensandwichfood(){return findElementByXpath("//*[contains(text(),'Grilled Chicken')]");}
    public WebElement removegrilledchickensandwichbtn(){return findElementByXpath("//a[contains(@title,'Remove Grilled C')]");}
}

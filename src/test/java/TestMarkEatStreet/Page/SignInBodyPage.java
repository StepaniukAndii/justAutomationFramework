package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInBodyPage extends BasePage{
    public SignInBodyPage(WebDriver driver) {super(driver);}
    public WebElement signinbtn(){return findElementByXpath("//input[contains(@id,'email')]");}
    public WebElement passwordinput(){return findElementByXpath("//input[contains(@id,'password')]");}
    public WebElement signinbutton(){return findElementByXpath("//button[contains(@id,'signin')]");}
}

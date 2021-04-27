package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DemoqaLocators extends BasePage {
    public DemoqaLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement demoqaElements(){return findElement ("//div[@class='card mt-4 top-card'][1]");}
    public WebElement demoqaBoxText(){return findElement ("//span[text()='Text Box']");}
    public WebElement demoqaName(){return findElement ("//input[@id='userName']");}
    public WebElement demoqaEmail(){return findElement ("//input[@id='userEmail']");}
    public WebElement demoqaAdress(){return findElement ("//textarea[@id='currentAddress']");}
    public WebElement demoqaPermanentAddress(){return findElement ("//textarea[@id='permanentAddress']");}
    public WebElement demoqaButtonSubmit(){return findElement ("//button[@id='submit']");}
    public List<WebElement> demoqaListTextBox(){
        return getElements ("//div[@class='border col-md-12 col-sm-12']/p");
    }
}